package qw2;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import cx2.h;
import dt2.g;
import iw2.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jw2.e;
import kw2.d;
import o13.r;
import p005kotlin.Metadata;
import v13.c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqw2/b;", "Lkw2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "Ldt2/g;", "messenger", "<init>", "(Landroid/content/Context;JLdt2/g;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f148384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f148385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f148386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, long j8, g gVar) {
        super(gVar);
        context.getClass();
        gVar.getClass();
        this.f148384e = context;
        this.f148385f = j8;
        this.f148386g = new h("RealTimeSettingsStartUpDataService", null, 2, null);
    }

    @Override // kw2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getF148386g() {
        return this.f148386g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        if (r8 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f148383c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f148383c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objC = aVar.f148381a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f148383c;
        if (i15 == 0) {
            r.b(objC);
            aVar.f148383c = 1;
            objC = c(builder, aVar);
            if (objC != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            r.b(objC);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        return (e) objC;
        GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService = (GDIRealtimeSettingsProto.RealtimeSettingsService) objC;
        if (realtimeSettingsService == null) {
            return null;
        }
        this.f148386g.getClass();
        iw2.a.C1825a c1825a = iw2.a.f95338a;
        aVar.f148383c = 2;
        c1825a.getClass();
        if (realtimeSettingsService.hasStartUpDataResponse()) {
            String appLocaleLanguagePartNumber = realtimeSettingsService.getStartUpDataResponse().getAppLocaleLanguagePartNumber();
            iw2.a.f95339b.getClass();
            ArrayList arrayList = new ArrayList();
            List<GDIRealtimeSettingsProto.IconSet> iconSetsList = realtimeSettingsService.getStartUpDataResponse().getIconSetsList();
            iconSetsList.getClass();
            Iterator<T> it = iconSetsList.iterator();
            while (it.hasNext()) {
                arrayList.add(((GDIRealtimeSettingsProto.IconSet) it.next()).name());
            }
            h hVar = iw2.a.f95339b;
            arrayList.toString();
            hVar.getClass();
            String strName = realtimeSettingsService.getStartUpDataResponse().getCommunicateType().name();
            w.f95547a.getClass();
            Context context = this.f148384e;
            context.getClass();
            strName.getClass();
            w.f95548b.getClass();
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit();
            editorEdit.putString(context.getString(R.string.key_device_communication_type, String.valueOf(this.f148385f)), strName);
            editorEdit.apply();
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52590b.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52596h = strName;
            objC = new e(strName, appLocaleLanguagePartNumber, arrayList);
        } else {
            iw2.a.f95339b.b("handlePartNumberResponse: data response does not have language response, returning null");
            objC = null;
        }
    }
}
