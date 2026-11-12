package com.garmin.android.library.promotionlibrary.database;

import androidx.room.b0;
import androidx.room.e;
import androidx.room.g;
import d81.t;
import ff2.i;
import ff2.j;
import ff2.k;
import gl1.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/promotionlibrary/database/a;", "Ldf2/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements df2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f50541c = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f50542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1009a f50543b;

    /* JADX INFO: renamed from: com.garmin.android.library.promotionlibrary.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/library/promotionlibrary/database/a$a", "Landroidx/room/g;", "Ldf2/c;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1009a extends g<df2.c> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, df2.c cVar2) {
            df2.c cVar3 = cVar2;
            cVar.getClass();
            cVar3.getClass();
            cVar.h(1, cVar3.f59444a);
            cVar.q3(2, cVar3.f59445b);
            cVar.h(3, cVar3.f59446c);
            cVar.h(4, cVar3.f59447d);
            cVar.h(5, cVar3.f59448e);
            cVar.q3(6, cVar3.f59449f);
            cVar.q3(7, cVar3.f59450g);
            cVar.q3(8, cVar3.f59451h);
            cVar.q3(9, cVar3.f59452i);
            cVar.q3(10, cVar3.f59453j);
            cVar.q3(11, cVar3.f59454k);
            cVar.q3(12, cVar3.f59455l);
            cVar.q3(13, cVar3.f59456m);
            cVar.q3(14, cVar3.f59457n);
            cVar.q3(15, cVar3.f59458o);
            cVar.q3(16, cVar3.f59459p);
            cVar.q3(17, cVar3.f59460q);
            cVar.h(18, cVar3.f59461r);
            cVar.q3(19, cVar3.f59462s);
            cVar.q3(20, cVar3.f59463t);
            cVar.q3(21, cVar3.f59464u);
            cVar.q3(22, cVar3.f59465v);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `campaigns` (`campaignId`,`offerType`,`campaignBeginTimestamp`,`campaignEndTimestamp`,`updateTimestamp`,`offerBodyText`,`offerHeaderText`,`offerImageUrl`,`offerImageName`,`offerShopNowButtonText`,`offerTitleText`,`offerViewDetailsButtonText`,`detailEmailOfferButtonText`,`detailImageUrl`,`detailImageName`,`detailPromoCode`,`detailPromoCodeDetailText`,`detailPromoCodeExpirationDate`,`detailShopNowUrl`,`detailTitleText`,`detailBodyText`,`detailBodyDetailText`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/library/promotionlibrary/database/a$b", "Landroidx/room/e;", "Ldf2/c;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends e<df2.c> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, df2.c cVar2) {
            df2.c cVar3 = cVar2;
            cVar.getClass();
            cVar3.getClass();
            long j8 = cVar3.f59444a;
            cVar.h(1, j8);
            cVar.q3(2, cVar3.f59445b);
            cVar.h(3, cVar3.f59446c);
            cVar.h(4, cVar3.f59447d);
            cVar.h(5, cVar3.f59448e);
            cVar.q3(6, cVar3.f59449f);
            cVar.q3(7, cVar3.f59450g);
            cVar.q3(8, cVar3.f59451h);
            cVar.q3(9, cVar3.f59452i);
            cVar.q3(10, cVar3.f59453j);
            cVar.q3(11, cVar3.f59454k);
            cVar.q3(12, cVar3.f59455l);
            cVar.q3(13, cVar3.f59456m);
            cVar.q3(14, cVar3.f59457n);
            cVar.q3(15, cVar3.f59458o);
            cVar.q3(16, cVar3.f59459p);
            cVar.q3(17, cVar3.f59460q);
            cVar.h(18, cVar3.f59461r);
            cVar.q3(19, cVar3.f59462s);
            cVar.q3(20, cVar3.f59463t);
            cVar.q3(21, cVar3.f59464u);
            cVar.q3(22, cVar3.f59465v);
            cVar.h(23, j8);
        }

        @Override // androidx.room.e
        public final String b() {
            return "UPDATE OR REPLACE `campaigns` SET `campaignId` = ?,`offerType` = ?,`campaignBeginTimestamp` = ?,`campaignEndTimestamp` = ?,`updateTimestamp` = ?,`offerBodyText` = ?,`offerHeaderText` = ?,`offerImageUrl` = ?,`offerImageName` = ?,`offerShopNowButtonText` = ?,`offerTitleText` = ?,`offerViewDetailsButtonText` = ?,`detailEmailOfferButtonText` = ?,`detailImageUrl` = ?,`detailImageName` = ?,`detailPromoCode` = ?,`detailPromoCodeDetailText` = ?,`detailPromoCodeExpirationDate` = ?,`detailShopNowUrl` = ?,`detailTitleText` = ?,`detailBodyText` = ?,`detailBodyDetailText` = ? WHERE `campaignId` = ?";
        }
    }

    public a(b0 b0Var) {
        b0Var.getClass();
        this.f50542a = b0Var;
        this.f50543b = new C1009a();
        new b();
    }

    @Override // df2.a
    public final Object a(long j8, i.d dVar) throws Throwable {
        Object objQ = d.Q(this.f50542a, false, true, new a02.a(j8, 15), dVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // df2.a
    public final Object b(k kVar) {
        return d.Q(this.f50542a, true, false, new t(7), kVar);
    }

    @Override // df2.a
    public final Object c(long j8, j jVar) {
        return d.Q(this.f50542a, true, false, new a02.a(j8, 14), jVar);
    }

    @Override // df2.a
    public final Object d(df2.c cVar, v13.i iVar) throws Throwable {
        Object objQ = d.Q(this.f50542a, false, true, new cn1.d(19, this, cVar), iVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/promotionlibrary/database/a$c;", "", "<init>", "()V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
