package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/k;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lfu1/n;", "", ModelSourceWrapper.POSITION, "", "articleId", "language", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends com.garmin.android.library.backgroundtaskmanagement.b<fu1.n> {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/k$a", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f45177c;

        public a(String str, int i14, k kVar) {
            this.f45175a = str;
            this.f45176b = i14;
            this.f45177c = kVar;
        }

        @Override // iu1.j
        public final void c(String str) {
            fu1.h hVarA = new c(this.f45175a, str).a();
            if (hVarA != null) {
                this.f45177c.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new fu1.n(this.f45176b, hVarA));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i14, String str, String str2, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        str.getClass();
        str2.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new fu1.n(i14, null, 2, null));
        cw.e.a(this, new xt1.c(new fu1.k("articles", new fu1.b(str, str2).a(), null, 4, null), new a(str, i14, this)));
    }
}
