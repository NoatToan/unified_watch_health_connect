package pj1;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.model.MccItem;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.model.MccItems;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpj1/a;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2616a f137878b = new C2616a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.t f137879c = o13.m.b(new p40.f(19));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u53.d f137880a;

    public a() {
        m1 m1VarC = g8.i.c();
        x53.c cVar = s0.f129406a;
        this.f137880a = o53.c0.a(x53.b.f189152a.plus(m1VarC));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Long l14, v13.c cVar) throws IOException {
        b bVar;
        ArrayList<sd2.f> arrayList;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f137884c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f137884c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f137882a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f137884c;
        if (i15 == 0) {
            o13.r.b(obj);
            sj1.a.f159441a.getClass();
            ((sj1.a) sj1.a.f159442b.getValue()).getClass();
            str.getClass();
            Gson gson = new Gson();
            GarminConnectMobileApp.f28685g.getClass();
            InputStream inputStreamOpenRawResource = GarminConnectMobileApp.a.a().getResources().openRawResource(R.raw.mcc);
            inputStreamOpenRawResource.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            for (int i16 = inputStreamOpenRawResource.read(bArr); i16 != -1; i16 = inputStreamOpenRawResource.read(bArr)) {
                byteArrayOutputStream.write(bArr, 0, i16);
            }
            inputStreamOpenRawResource.close();
            String string = byteArrayOutputStream.toString("UTF-8");
            string.getClass();
            MccItems mccItems = (MccItems) gson.fromJson(string, MccItems.class);
            Collections.sort(mccItems, new a61.c(new si1.a(8), 23));
            mccItems.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (MccItem mccItem : mccItems) {
                if (p005kotlin.jvm.internal.s.g(mccItem.getCountryCode(), str)) {
                    arrayList2.add(mccItem);
                }
            }
            MccItem mccItem2 = (MccItem) h0.d0(arrayList2);
            if (mccItem2 != null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "AssistancePlusMccManager", "findMccAndNotifyDevice record " + mccItem2);
                Locale locale = new Locale("", mccItem2.getCountryCode());
                int mcc = mccItem2.getMcc();
                String displayCountry = locale.getDisplayCountry();
                displayCountry.getClass();
                bVar.f137884c = 1;
                GDILTEProto.LTEService.Builder apGeofencingNotification = GDILTEProto.LTEService.newBuilder().setApGeofencingNotification(GDILTEProto.AssistancePlusGeofencingNotification.newBuilder().setCountry(GDILTEProto.MobileCountry.newBuilder().setCode(mcc).setName(displayCountry)));
                GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                builderNewBuilder.getClass();
                apGeofencingNotification.getClass();
                builderNewBuilder.setExtension(GDILTEExtension.lteService, apGeofencingNotification.build());
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    i2.a.b(a2Var, "AssistancePlusMccManager", "sendMCCandCountrytoDevice " + jLongValue);
                    ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
                    GDISmartProto.Smart smartBuild = builderNewBuilder.build();
                    smartBuild.getClass();
                    protobufRequestManager.initiateNotification(smartBuild, jLongValue);
                } else {
                    rd2.f.a().f152045a.getClass();
                    ArrayList arrayListD = rd2.j.d();
                    if (arrayListD != null) {
                        arrayList = new ArrayList();
                        for (Object obj2 : arrayListD) {
                            if (((sd2.f) obj2).isPaired()) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        for (sd2.f fVar : arrayList) {
                            if (fVar.y0()) {
                                String strE = org.apache.commons.lang3.e.e(fVar.getUnitID(), "sendMCCandCountrytoDevice ");
                                i2.a aVar3 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar3.getClass();
                                i2.a.b(a2Var2, "AssistancePlusMccManager", strE);
                                ProtobufRequestManager protobufRequestManager2 = ProtobufRequestManager.getInstance();
                                GDISmartProto.Smart smartBuild2 = builderNewBuilder.build();
                                smartBuild2.getClass();
                                protobufRequestManager2.initiateNotification(smartBuild2, fVar.getUnitID());
                            }
                        }
                    }
                }
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(double d14, double d15, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f137887c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f137887c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f137885a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f137887c;
        if (i15 == 0) {
            o13.r.b(objJ);
            tj1.n nVarA = tj1.n.a.a(tj1.n.f165155b);
            cVar2.f137887c = 1;
            objJ = f0.J(nVarA, new tj1.o(nVarA, d14, d15, null), cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            tj1.l lVar = (tj1.l) ((v2.b) v2Var).f47386a;
            if (lVar != null) {
                return lVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
            }
            return null;
        }
        String strF = b71.i.f("Error occured while fetching reverse geo lookup ", v2Var);
        p92.y.f136664a.getClass();
        p92.y.a.c("AssistancePlusMccManager", strF);
        return null;
    }

    /* JADX INFO: renamed from: pj1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpj1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "LAST_KNOWN_LOCATION_EXPIRED_TIME", "I", "", "LOCATION_REQUEST_TIMEOUT_MILLIS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2616a {
        public /* synthetic */ C2616a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2616a() {
        }
    }
}
