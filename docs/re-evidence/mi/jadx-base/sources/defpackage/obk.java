package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.fitness.access.GoogleFitAccessActivity;
import com.xiaomi.fitness.access.misport.MiSportImportActivity;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class obk extends IntentSchemeHandle {
    public final void a(Context context, Class<?> cls, String str, String str2) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        Logger.i("RegionHlthSchemaHandler", "gotoFragmentBySingleTop after code = " + str + ", msg=" + str2);
        intent.putExtra("extra_key_code", str);
        intent.putExtra(MiSportImportActivity.EXTRA_KEY_MSG, str2);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c
    /* JADX INFO: renamed from: authority */
    public String getAUTHORITY() {
        return "region.hlth.io.mi.com";
    }

    public final void b(Context context, Uri uri) {
        new Bundle();
        try {
            String queryParameter = uri.getQueryParameter("code");
            String queryParameter2 = uri.getQueryParameter("message");
            Logger.i("RegionHlthSchemaHandler", "handleMiSportUri code = " + queryParameter + ", msg=" + queryParameter2);
            a(context, MiSportImportActivity.class, queryParameter, queryParameter2);
        } catch (UnsupportedOperationException e) {
            Logger.e("RegionHlthSchemaHandler", "handleMiSportUri error ", e);
        }
    }

    public final void c(Context context, Uri uri) {
        Logger.i("RegionHlthSchemaHandler", "processGoogleFitSchema uri=" + uri);
        String queryParameter = uri.getQueryParameter("code");
        Intent intent = new Intent();
        Logger.i("RegionHlthSchemaHandler", "processGoogleFitSchema authCode= " + queryParameter);
        if (queryParameter == null || queryParameter.isEmpty()) {
            Logger.i("RegionHlthSchemaHandler", "processGoogleFitSchema authCode is not valid.");
            return;
        }
        intent.putExtra(ThirdPartAccessConstants.PARAM_AUTH_CODE, queryParameter);
        intent.setClass(context, GoogleFitAccessActivity.class);
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        context.startActivity(intent);
    }

    @Override // defpackage.y0c
    public void doProcess(Context context, Uri uri) {
        String path = uri.getPath();
        Logger.i("RegionHlthSchemaHandler", "doProcess uri=" + uri + " path=" + path + " canHandle=" + canHandle(uri));
        path.hashCode();
        switch (path) {
            case "/applinks/auth":
                ThirdPartyAccessExtKt.processSuuntoUri(context, uri);
                break;
            case "/googlefit":
                Logger.i("RegionHlthSchemaHandler", "doProcess GOOGLE_FIT_PATH");
                c(context, uri);
                return;
            case "/applinks/misport":
                b(context, uri);
                return;
        }
        Logger.i("RegionHlthSchemaHandler", "unexpected path " + path);
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    public List<String> parameterList() {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    public List<String> pathList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("/applinks/misport");
        arrayList.add(ThirdPartAccessConstants.GOOGLE_FIT_STATE);
        arrayList.add("/applinks/auth");
        return arrayList;
    }
}
