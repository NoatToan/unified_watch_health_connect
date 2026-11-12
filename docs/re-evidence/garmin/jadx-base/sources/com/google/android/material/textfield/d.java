package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53258b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f53257a = i14;
        this.f53258b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53257a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f53258b).lambda$tearDown$2();
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f53258b).lambda$afterEditTextChanged$3();
                break;
            default:
                ((TextInputLayout) this.f53258b).lambda$onGlobalLayout$1();
                break;
        }
    }
}
