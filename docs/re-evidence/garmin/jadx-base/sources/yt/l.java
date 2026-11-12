package yt;

import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lyt/l;", "Lcom/airbnb/lottie/value/LottieValueCallback;", "", "", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends LottieValueCallback<Integer[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tt.m f199338b;

    public l(int i14, tt.m mVar) {
        this.f199337a = i14;
        this.f199338b = mVar;
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final Integer[] getValue(LottieFrameInfo<Integer[]> lottieFrameInfo) {
        String strH = am.j.h(this.f199337a, "onPageChanged: ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", strH);
        tt.m mVar = this.f199338b;
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "chapter color name: " + mVar.name());
        return mVar.f166327b;
    }
}
