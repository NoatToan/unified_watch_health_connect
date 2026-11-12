package com.xiaomi.fitness.widget.button;

/* JADX INFO: loaded from: classes10.dex */
public interface ISwitchButton {

    public enum ScrollState {
        Idle,
        Drag,
        Fling
    }

    public interface a {
        void onCheckedChanged(boolean z, ISwitchButton iSwitchButton);
    }

    public interface b {
    }

    public interface c {
    }

    Object getTag();

    boolean isChecked();

    boolean setChecked(boolean z);

    void setOnCheckedChangeCallback(a aVar);
}
