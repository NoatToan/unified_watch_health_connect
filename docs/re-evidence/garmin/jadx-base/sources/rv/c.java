package rv;

import android.text.Editable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Editable f154608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f154609c;

    public /* synthetic */ c(Editable editable, b bVar, int i14) {
        this.f154607a = i14;
        this.f154608b = editable;
        this.f154609c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f154607a) {
            case 0:
                if (!TextUtils.isEmpty(String.valueOf(this.f154608b))) {
                    b.C6(this.f154609c);
                }
                break;
            default:
                if (!TextUtils.isEmpty(String.valueOf(this.f154608b))) {
                    b.C6(this.f154609c);
                }
                break;
        }
    }
}
