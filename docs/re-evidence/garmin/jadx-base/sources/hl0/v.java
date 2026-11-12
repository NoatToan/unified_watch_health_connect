package hl0;

import android.app.DownloadManager;
import android.content.ContentValues;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIInternationalGolf;
import com.google.android.gms.common.Scopes;
import com.google.common.net.HttpHeaders;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import gg1.v0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.InitiateGolfCourseDownloadUseCase$invoke$4", f = "InitiateGolfCourseDownloadUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il0.a f84341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f84342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDIInternationalGolf.MapType f84343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f84344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(il0.a aVar, u uVar, GDIInternationalGolf.MapType mapType, Long l14, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f84341a = aVar;
        this.f84342b = uVar;
        this.f84343c = mapType;
        this.f84344d = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f84341a, this.f84342b, this.f84343c, this.f84344d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer buildId;
        String name;
        Integer num;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        il0.a aVar2 = this.f84341a;
        int globalLayoutId = aVar2.getGlobalLayoutId();
        u uVar = this.f84342b;
        rd2.l lVar = uVar.f84339c;
        Integer num2 = new Integer(globalLayoutId);
        GDIInternationalGolf.MapType mapType = this.f84343c;
        int iA = el0.a.a(mapType);
        lVar.getClass();
        sd2.h hVarI = rd2.l.i(iA, num2);
        if (hVarI == null || (buildId = hVarI.f158658a) == null) {
            buildId = aVar2.getBuildId();
        }
        int globalLayoutId2 = (hVarI == null || (num = hVarI.f158663f) == null) ? aVar2.getGlobalLayoutId() : num.intValue();
        if (hVarI == null || (name = hVarI.f158666i) == null) {
            name = aVar2.getName();
        }
        String strV = d53.u.v(d53.u.v(d53.u.v("CourseViewData/courseData/{build_id},{global_layout_id},{bits}", "{build_id}", String.valueOf(buildId), false), "{global_layout_id}", String.valueOf(globalLayoutId2), false), "{bits}", "32", false);
        if (mapType == GDIInternationalGolf.MapType.MEDIUM_PLUS) {
            strV = strV.concat("/Hazards");
        }
        v0.T.getClass();
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(v0.a.b().e().concat(strV)));
        request.setTitle(uVar.f84338b.getString(R.string.lbl_golf_course));
        request.setDescription(name);
        request.setAllowedNetworkTypes(3);
        request.setVisibleInDownloadsUi(true);
        request.addRequestHeader(HttpHeaders.ACCEPT, "application/octet-stream");
        Long l14 = this.f84344d;
        if (l14 != null) {
            request.addRequestHeader("Garmin-UnitId", String.valueOf(l14.longValue()));
        }
        request.setNotificationVisibility(2);
        long jEnqueue = uVar.f84337a.enqueue(request);
        rd2.l lVar2 = uVar.f84339c;
        int i14 = globalLayoutId2;
        if (hVarI != null) {
            Long l15 = new Long(jEnqueue);
            Integer num3 = hVarI.f158658a;
            Integer num4 = hVarI.f158663f;
            String str = hVarI.f158666i;
            String str2 = hVarI.f158672o;
            String str3 = hVarI.f158659b;
            String str4 = hVarI.f158671n;
            String str5 = hVarI.f158670m;
            String str6 = hVarI.f158660c;
            Integer num5 = hVarI.f158664g;
            Integer num6 = hVarI.f158665h;
            String str7 = hVarI.f158673p;
            String str8 = hVarI.f158662e;
            String str9 = hVarI.f158668k;
            String str10 = hVarI.f158669l;
            String str11 = hVarI.f158661d;
            String str12 = hVarI.f158674q;
            Integer num7 = hVarI.f158667j;
            Integer num8 = hVarI.f158677v;
            int iIntValue = num8 != null ? num8.intValue() : 7;
            Integer num9 = hVarI.f158675r;
            int iA2 = el0.a.a(mapType);
            lVar2.getClass();
            int i15 = iIntValue;
            String[] strArr = {String.valueOf(num4), String.valueOf(iA2)};
            try {
                ContentValues contentValues = new ContentValues(22);
                contentValues.put("android_download_id", l15);
                contentValues.put("build_id", num3);
                contentValues.put("binary", (byte[]) null);
                contentValues.put("download_mgr_status_reason_id", (Integer) null);
                contentValues.put("download_status_id", (Integer) 3);
                contentValues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("name", str);
                contentValues.put("street", str2);
                contentValues.put("city", str3);
                contentValues.put(RemoteConfigConstants.ResponseFieldKey.STATE, str4);
                contentValues.put("postal_code", str5);
                contentValues.put("country", str6);
                contentValues.put("semi_circle_latitude", Integer.valueOf(num5 == null ? 0 : num5.intValue()));
                contentValues.put("semi_circle_longitude", Integer.valueOf(num6 == null ? 0 : num6.intValue()));
                contentValues.put("website_url", str7);
                contentValues.put(Scopes.EMAIL, str8);
                contentValues.put("telephone", str9);
                contentValues.put("telephone_extension", str10);
                contentValues.put("designer", str11);
                contentValues.put("year_designed", str12);
                contentValues.put("hole_count", num7);
                contentValues.put("membership_type_id", Integer.valueOf(i15));
                contentValues.put("version", num9);
                qd2.a.b().f144484a.update("golf_downloaded_course", contentValues, "global_layout_id =? and map_type =?", strArr);
            } catch (Exception e4) {
                rd2.l.f152081a.error("updateByGlobalLayoutID", (Throwable) e4);
            }
        } else {
            Long l16 = new Long(jEnqueue);
            Integer buildId2 = aVar2.getBuildId();
            Integer num10 = new Integer(aVar2.getGlobalLayoutId());
            String name2 = aVar2.getName();
            String street = aVar2.getStreet();
            String city = aVar2.getCity();
            String state = aVar2.getState();
            String postalCode = aVar2.getPostalCode();
            String country = aVar2.getCountry();
            Integer latitude = aVar2.getLatitude();
            Integer longitude = aVar2.getLongitude();
            String webSite = aVar2.getWebSite();
            String str13 = aVar2.getCom.google.android.gms.common.Scopes.EMAIL java.lang.String();
            String phone = aVar2.getPhone();
            String phoneExtension = aVar2.getPhoneExtension();
            String designer = aVar2.getDesigner();
            String yearDesigned = aVar2.getYearDesigned();
            Integer numberOfHoles = aVar2.getNumberOfHoles();
            int i16 = aVar2.getMembershipType().f93972a;
            Integer version = aVar2.getVersion();
            int iA3 = el0.a.a(mapType);
            lVar2.getClass();
            ContentValues contentValues2 = new ContentValues(23);
            contentValues2.put("android_download_id", l16);
            contentValues2.put("build_id", buildId2);
            contentValues2.put("global_layout_id", num10);
            contentValues2.put("download_mgr_status_reason_id", (Integer) null);
            contentValues2.put("download_status_id", (Integer) 3);
            contentValues2.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues2.put("name", name2);
            contentValues2.put("street", street);
            contentValues2.put("city", city);
            contentValues2.put(RemoteConfigConstants.ResponseFieldKey.STATE, state);
            contentValues2.put("postal_code", postalCode);
            contentValues2.put("country", country);
            contentValues2.put("semi_circle_latitude", Integer.valueOf(latitude == null ? 0 : latitude.intValue()));
            contentValues2.put("semi_circle_longitude", Integer.valueOf(longitude == null ? 0 : longitude.intValue()));
            contentValues2.put("website_url", webSite);
            contentValues2.put(Scopes.EMAIL, str13);
            contentValues2.put("telephone", phone);
            contentValues2.put("telephone_extension", phoneExtension);
            contentValues2.put("designer", designer);
            contentValues2.put("year_designed", yearDesigned);
            contentValues2.put("hole_count", numberOfHoles);
            contentValues2.put("membership_type_id", Integer.valueOf(i16));
            contentValues2.put("map_type", Integer.valueOf(iA3));
            contentValues2.put("version", version);
            try {
                qd2.a.b().f144484a.insertOrThrow("golf_downloaded_course", "blah", contentValues2);
            } catch (Exception e14) {
                rd2.l.f152081a.error("insert", (Throwable) e14);
            }
        }
        a2 a2Var = a2.GOLF;
        String strH = am.j.h(i14, "broadcastDatabaseContentChanged: golf course initiate download ");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "InitiateGolfCourseDownloadUseCase", strH);
        ol0.a aVar3 = new ol0.a(i14, 3);
        oi2.a.f132270a.getClass();
        l73.c.b().e(aVar3);
        return Unit.INSTANCE;
    }
}
