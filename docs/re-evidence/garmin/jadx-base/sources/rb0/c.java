package rb0;

import android.widget.ImageView;
import aq.s1;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hv.a f151546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f151547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f151548d;

    public /* synthetic */ c(hv.a aVar, int i14, l lVar, int i15) {
        this.f151545a = i15;
        this.f151546b = aVar;
        this.f151547c = i14;
        this.f151548d = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        ImageView imageView = (ImageView) obj;
        switch (this.f151545a) {
            case 0:
                imageView.getClass();
                jt2.a aVarC = this.f151546b.c(this.f151547c);
                if (aVarC != null) {
                    aVarC.f100855a = new s1(this.f151548d, 12);
                    imageView.setImageDrawable(aVarC);
                    aVarC.a(500);
                }
                break;
            default:
                imageView.getClass();
                jt2.a aVarC2 = this.f151546b.c(this.f151547c);
                if (aVarC2 != null) {
                    aVarC2.f100855a = new s1(this.f151548d, 14);
                    imageView.setImageDrawable(aVarC2);
                    aVarC2.a(500);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
