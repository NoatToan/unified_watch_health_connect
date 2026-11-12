package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.wallet.accessdoor.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class DoorItemScheduleTimeBinding implements ViewBinding {

    @NonNull
    private final Button a;

    private DoorItemScheduleTimeBinding(@NonNull Button button) {
        this.a = button;
    }

    @NonNull
    public static DoorItemScheduleTimeBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new DoorItemScheduleTimeBinding((Button) view);
    }

    @NonNull
    public static DoorItemScheduleTimeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DoorItemScheduleTimeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.door_item_schedule_time, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Button getRoot() {
        return this.a;
    }
}
