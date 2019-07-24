package com.alfilippov.viewmodeljetpack.ViewModel;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;

public class ChronometerViewModel extends ViewModel {
    @Nullable
    private Long mStartTime;

    @Nullable
    public Long getmStartTime() {
        return mStartTime;
    }

    public void setmStartTime(@Nullable Long mStartTime) {
        this.mStartTime = mStartTime;
    }
}
