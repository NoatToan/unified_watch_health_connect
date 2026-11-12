package cu1;

import android.text.style.ForegroundColorSpan;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.ArticleContentActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu1/d;", "Li03/a;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends i03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArticleContentActivity f55660a;

    public d(ArticleContentActivity articleContentActivity) {
        this.f55660a = articleContentActivity;
    }

    @Override // i03.a, i03.i
    public final void b(i03.j.a aVar) {
        final int i14 = 0;
        final ArticleContentActivity articleContentActivity = this.f55660a;
        aVar.a(h73.v.class, new i03.s() { // from class: cu1.c
            @Override // i03.s
            public final Object a(i03.g gVar, i03.q qVar) {
                switch (i14) {
                    case 0:
                        gVar.getClass();
                        qVar.getClass();
                        return new ForegroundColorSpan[]{new ForegroundColorSpan(articleContentActivity.getColor(R.color.gcm_text_primary))};
                    default:
                        gVar.getClass();
                        qVar.getClass();
                        return new ForegroundColorSpan[]{new ForegroundColorSpan(articleContentActivity.getColor(R.color.gcm_text_primary))};
                }
            }
        });
        final int i15 = 1;
        aVar.a(h73.i.class, new i03.s() { // from class: cu1.c
            @Override // i03.s
            public final Object a(i03.g gVar, i03.q qVar) {
                switch (i15) {
                    case 0:
                        gVar.getClass();
                        qVar.getClass();
                        return new ForegroundColorSpan[]{new ForegroundColorSpan(articleContentActivity.getColor(R.color.gcm_text_primary))};
                    default:
                        gVar.getClass();
                        qVar.getClass();
                        return new ForegroundColorSpan[]{new ForegroundColorSpan(articleContentActivity.getColor(R.color.gcm_text_primary))};
                }
            }
        });
    }

    @Override // i03.a, i03.i
    public final void f(j03.r.a aVar) {
        aVar.f96199e = 0;
    }
}
