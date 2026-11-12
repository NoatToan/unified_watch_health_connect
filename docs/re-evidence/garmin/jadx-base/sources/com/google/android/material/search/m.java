package com.google.android.material.search;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53238b;

    public /* synthetic */ m(Object obj, int i14) {
        this.f53237a = i14;
        this.f53238b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53237a) {
            case 0:
                ((SearchViewAnimationHelper) this.f53238b).lambda$startShowAnimationExpand$0();
                break;
            case 1:
                ((SearchViewAnimationHelper) this.f53238b).lambda$startShowAnimationTranslate$1();
                break;
            default:
                ((SearchBar) this.f53238b).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
