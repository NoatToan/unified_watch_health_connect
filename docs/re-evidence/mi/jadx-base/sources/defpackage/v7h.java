package defpackage;

import com.xiaomi.fitness.widget.button.ISwitchButton;

/* JADX INFO: loaded from: classes8.dex */
public final class v7h implements ISwitchButton.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36592b;

    public interface a {
        void c(int i, boolean z, ISwitchButton iSwitchButton);
    }

    public v7h(a aVar, int i) {
        this.f36591a = aVar;
        this.f36592b = i;
    }

    @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
    public void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
        this.f36591a.c(this.f36592b, z, iSwitchButton);
    }
}
