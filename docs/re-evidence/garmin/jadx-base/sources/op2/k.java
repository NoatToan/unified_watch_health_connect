package op2;

import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity", f = "NewFitPayWebNavigationActivity.kt", l = {StatusLine.HTTP_TEMP_REDIRECT, 309}, m = "getCreditCard", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f133220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f133222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewFitPayWebNavigationActivity f133223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f133224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, t13.d<? super k> dVar) {
        super(dVar);
        this.f133223d = newFitPayWebNavigationActivity;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133222c = obj;
        this.f133224e |= Integer.MIN_VALUE;
        return NewFitPayWebNavigationActivity.ca(this.f133223d, null, this);
    }
}
