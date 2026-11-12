package com.garmin.feature.garminpay.ui.addcard;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import e23.l;
import g.h;
import ms2.f;
import ms2.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import ps2.w;
import qs2.e;
import tr2.y;
import wr2.m;
import zd0.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/b;", "", "Lhn2/c;", "activity", "Lkotlin/Function1;", "Lcom/garmin/feature/garminpay/ui/addcard/b$c;", "", "onError", "Lkotlin/Function0;", "onOK", "onCanceled", "<init>", "(Lhn2/c;Le23/l;Le23/a;Le23/a;)V", "c", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1079b f51838f = new C1079b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn2.c f51839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<c, Unit> f51840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f51841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f51842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f51843e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, hn2.c.class, "finish", "finish()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((hn2.c) this.receiver).finish();
            return Unit.INSTANCE;
        }
    }

    public interface c extends Parcelable {
        public static final a Q = a.f51845a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/b$c$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f51845a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.addcard.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/b$c$b;", "Lcom/garmin/feature/garminpay/ui/addcard/b$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1080b implements c {
            public static final Parcelable.Creator<C1080b> CREATOR = new a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.addcard.b$c$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C1080b> {
                @Override // android.os.Parcelable.Creator
                public final C1080b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return new C1080b();
                }

                @Override // android.os.Parcelable.Creator
                public final C1080b[] newArray(int i14) {
                    return new C1080b[i14];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(hn2.c cVar, l<? super c, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f51839a = cVar;
        this.f51840b = lVar;
        this.f51841c = aVar;
        this.f51842d = aVar2;
        this.f51843e = cVar.registerForActivityResult(new h(), new y(this, 25));
    }

    public final void a(f fVar, long j8) {
        fVar.getClass();
        try {
            g gVarA = w.f140538a.a(fVar.getF206687h().f147396a);
            if (gVarA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.f51843e.a(gVarA.d(fVar, j8), null);
        } catch (Throwable unused) {
            this.f51840b.invoke(new c.C1080b());
        }
    }

    public final void b(e eVar, ns2.a<? extends ms2.e> aVar, long j8, String str) {
        eVar.getClass();
        try {
            f.c<Intent> cVar = this.f51843e;
            SelectOperatorActivity.a aVar2 = SelectOperatorActivity.f51812i;
            hn2.c cVar2 = this.f51839a;
            aVar2.getClass();
            cVar.a(SelectOperatorActivity.a.a(cVar2, eVar, aVar, j8, str), null);
        } catch (Throwable th3) {
            f51838f.f51844a.a().warn("Failed to start SelectOperatorActivity", th3);
            this.f51840b.invoke(new c.C1080b());
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.addcard.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/b$b;", "", "<init>", "()V", "", "EXTRA_ERROR", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1079b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f51844a;

        private C1079b() {
            hn2.f fVar = hn2.f.f84562a;
            fVar.getClass();
            this.f51844a = new m(fVar, "ProductCatalogScreenNavigator");
        }

        public /* synthetic */ C1079b(j jVar) {
            this();
        }
    }

    public /* synthetic */ b(hn2.c cVar, l lVar, e23.a aVar, e23.a aVar2, int i14, j jVar) {
        this(cVar, lVar, (i14 & 4) != 0 ? new a(cVar) : aVar, (i14 & 8) != 0 ? new r0(28) : aVar2);
    }
}
