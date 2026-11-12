package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53264b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f53263a = i14;
        this.f53264b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53263a) {
            case 0:
                ((RadialViewGroup) this.f53264b).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) this.f53264b).lambda$onViewCreated$0();
                break;
        }
    }
}
