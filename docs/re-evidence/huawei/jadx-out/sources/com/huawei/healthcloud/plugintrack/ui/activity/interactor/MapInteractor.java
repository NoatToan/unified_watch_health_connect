package com.huawei.healthcloud.plugintrack.ui.activity.interactor;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.izn;
import defpackage.jaq;
import defpackage.jeq;
import defpackage.jes;
import defpackage.jew;
import defpackage.jey;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.LogAnonymous;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class MapInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f10931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10932c;
    private CustomProgressDialog d;
    private CustomProgressDialog.Builder e;
    private MarkResetListener f;
    private List<jes> g;
    private int h;
    private String i;
    private List<jeq> j;
    private IBaseResponseCallback o;

    public interface MapItemClickListener {
        void onClickListener(Object obj, int i);
    }

    public interface MarkResetListener {
        void onResetMarker(jeq jeqVar, int i);
    }

    public MapInteractor(Activity activity, Context context, int i) throws Throwable {
        boolean z;
        this.g = new ArrayList(16);
        this.j = new ArrayList(16);
        this.f10931b = activity;
        this.f10930a = context;
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        this.h = i;
        this.f10932c = jaqVar.c(i);
        String strS = jaqVar.s();
        if (TextUtils.isEmpty(this.f10932c) || !TextUtils.equals(strS, "10.0")) {
            String strC = jew.d().c(jey.c(this.h), this.h);
            this.f10932c = strC;
            if (!TextUtils.isEmpty(strC)) {
                jaqVar.f("10.0");
            }
            z = true;
        } else {
            z = false;
        }
        String strR = jaqVar.r();
        this.i = strR;
        if (TextUtils.isEmpty(strR)) {
            this.i = jew.d().f();
        }
        this.g = (List) izn.d(this.f10932c, new TypeToken<ArrayList<jes>>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.1
        });
        this.j = (List) izn.d(this.i, new TypeToken<ArrayList<jeq>>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.2
        });
        e();
        if (z) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f10932c = jew.d().c(jey.c(this.h), this.h);
        this.i = jew.d().f();
        this.g = (List) izn.d(this.f10932c, new TypeToken<ArrayList<jes>>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.3
        });
        this.j = (List) izn.d(this.i, new TypeToken<ArrayList<jeq>>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.4
        });
        d();
    }

    private void d() {
        jeq jeqVar;
        if (njy.e(this.j)) {
            LogUtil.j("Track_MapInteractor", "resetLastSelectMarkInfo: mark info list is empty");
            return;
        }
        Context context = this.f10930a;
        if (context == null) {
            LogUtil.j("Track_MapInteractor", "resetLastSelectMarkInfo: context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("retrack_file", 0);
        int i = -1;
        if (sharedPreferences.getInt("new_track_mode_custom_mark_position", -1) == -1) {
            LogUtil.a("Track_MapInteractor", "resetLastSelectMarkInfo: mark is default");
            return;
        }
        String string = sharedPreferences.getString("new_track_mode_custom_mark", null);
        if (TextUtils.isEmpty(string)) {
            LogUtil.a("Track_MapInteractor", "resetLastSelectMarkInfo: last selected mark is null ");
            return;
        }
        try {
            jeqVar = (jeq) new Gson().fromJson(string, jeq.class);
        } catch (JsonSyntaxException e) {
            LogUtil.j("Track_MapInteractor", "resetLastSelectMarkInfo: ", LogAnonymous.b(e));
            jeqVar = null;
        }
        if (jeqVar == null) {
            LogUtil.j("Track_MapInteractor", "resetLastSelectMarkInfo: last selected mark parse error");
            return;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            jeq jeqVar2 = this.j.get(i2);
            if (jeqVar2 != null && TextUtils.equals(jeqVar2.j(), jeqVar.j()) && TextUtils.equals(jeqVar2.b(), jeqVar.b())) {
                i = i2;
                break;
            }
        }
        if (this.f != null && njy.c(this.j, i)) {
            LogUtil.a("Track_MapInteractor", "resetLastSelectMarkInfo: newIndex = ", Integer.valueOf(i));
            this.f.onResetMarker(this.j.get(i), i);
        } else {
            this.f.onResetMarker(null, i);
        }
    }

    private void e() {
        SharedPreferences sharedPreferences = this.f10930a.getSharedPreferences(Integer.toString(20002), 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add("new_custom_gaode_map_information");
        arrayList.add("custom_gaode_map_information");
        arrayList.add("custom_google_map_information");
        arrayList.add("custom_hsm_map_information");
        arrayList.add("custom_mark_information");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.commit();
        SharedPreferences sharedPreferences2 = this.f10930a.getSharedPreferences("retrack_file", 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("new_track_gaode_custom_map");
        arrayList2.add("new_track_mode_custom_map_position");
        arrayList2.add("track_mode_custom_mark");
        arrayList2.add("track_gaode_custom_map");
        arrayList2.add("track_google_custom_map");
        arrayList2.add("track_hms_custom_map");
        arrayList2.add("track_mode_custom_map_position");
        arrayList2.add("track_goolge_custom_map_position");
        arrayList2.add("track_hms_custom_map_position");
        arrayList2.add("track_mode_custom_mark_position");
        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            editorEdit2.remove((String) it2.next());
        }
        editorEdit2.commit();
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_MapInteractor", "responseCallback == null");
            return;
        }
        this.o = iBaseResponseCallback;
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, this.g);
        arrayList.add(1, this.j);
        this.o.a(0, arrayList);
    }

    public void b() {
        LogUtil.a("Track_MapInteractor", "startDownloadConfig");
        jew.e();
        jew.d().a(true);
        jew.d().d((DynamicTrackDownloadUtils.DownloadResponseCallback) new b(this), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CustomProgressDialog customProgressDialog = this.d;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.e("Track_MapInteractor", "startDownloadProgress progress exist");
            return;
        }
        this.d = new CustomProgressDialog(this.f10931b);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.f10931b);
        this.e = builder;
        builder.e(this.f10931b.getString(R.string.IDS_downloading_custom_map_style)).e(new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_MapInteractor", "startDownLoadProgress onclick cancel");
                jew.d().c();
            }
        });
        CustomProgressDialog customProgressDialogC = this.e.c();
        this.d = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        if (!this.f10931b.isFinishing()) {
            this.d.show();
            this.e.b(0);
            this.e.b(UnitUtil.e(0.0d, 2, 0));
            this.e.d();
        }
        LogUtil.a("Track_MapInteractor", "mCustomProgressDialog.show()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        CustomProgressDialog customProgressDialog = this.d;
        if (customProgressDialog == null || !customProgressDialog.isShowing()) {
            return;
        }
        this.e.b(i);
        this.e.b(UnitUtil.e(i, 2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CustomProgressDialog customProgressDialog = this.d;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || this.f10931b.isFinishing()) {
            return;
        }
        this.d.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f10931b).a(str).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jew.d().a(MapInteractor.this.h);
            }
        }).a(R.string.IDS_motiontrack_common_ui_dialog_cancel, new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_MapInteractor", "cancal download map");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void c() {
        Context context = this.f10930a;
        if (context == null) {
            LogUtil.j("Track_MapInteractor", "resetLastSelectMapStyle: context is null");
            return;
        }
        int i = this.h;
        if (i != 1) {
            LogUtil.j("Track_MapInteractor", "resetLastSelectMapStyle: mapType is ", Integer.valueOf(i));
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("retrack_file", 0);
        int i2 = sharedPreferences.getInt("track_mode_custom_map_position_69", -1);
        if (i2 >= 0) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (njy.e(this.g, i2)) {
                editorEdit.putInt("track_mode_custom_map_position_69", -1);
                editorEdit.apply();
                LogUtil.j("Track_MapInteractor", "resetLastSelectMapStyle: mMapInformationList isOutOfBounds");
                return;
            }
            jes jesVar = this.g.get(i2);
            if (jesVar == null) {
                editorEdit.putInt("track_mode_custom_map_position_69", -1);
                editorEdit.apply();
                LogUtil.j("Track_MapInteractor", "resetLastSelectMapStyle: lastCustomMapInformation is null");
            } else {
                editorEdit.putString("track_gaode_custom_map_69", new Gson().toJson(jesVar));
                editorEdit.apply();
            }
        }
    }

    public void b(MarkResetListener markResetListener) {
        this.f = markResetListener;
    }

    static class b implements DynamicTrackDownloadUtils.DownloadResponseCallback {
        private final WeakReference<MapInteractor> d;

        b(MapInteractor mapInteractor) {
            this.d = new WeakReference<>(mapInteractor);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
        public void onMobile(int i) {
            MapInteractor mapInteractor = this.d.get();
            if (mapInteractor == null || mapInteractor.f10931b == null) {
                LogUtil.j("Track_MapInteractor", "mapInteractor or mActivity is null in onMobile");
                return;
            }
            mapInteractor.d(String.format(Locale.ENGLISH, mapInteractor.f10931b.getResources().getString(R.string.IDS_custom_map_style_mobile_network_notify), mapInteractor.f10931b.getString(R.string.IDS_device_upgrade_file_size_mb, new Object[]{UnitUtil.e(((double) i) / 1048576.0d, 1, 1)})));
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
        public void onStart() {
            MapInteractor mapInteractor = this.d.get();
            if (mapInteractor == null) {
                LogUtil.j("Track_MapInteractor", "mapInteractor is null in onStart");
            } else {
                mapInteractor.j();
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
        public void onProgress(int i) {
            MapInteractor mapInteractor = this.d.get();
            if (mapInteractor == null) {
                LogUtil.j("Track_MapInteractor", "mapInteractor is null in onProgress");
            } else {
                mapInteractor.d(i);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
        public void onSuccess() {
            MapInteractor mapInteractor = this.d.get();
            if (mapInteractor == null) {
                LogUtil.j("Track_MapInteractor", "mapInteractor is null in onSuccess");
                return;
            }
            mapInteractor.a();
            mapInteractor.f();
            jew.d().a(false);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
        public void onFail() {
            MapInteractor mapInteractor = this.d.get();
            if (mapInteractor == null) {
                LogUtil.j("Track_MapInteractor", "mapInteractor is null in onFail");
                return;
            }
            mapInteractor.a();
            if (mapInteractor.f10931b != null) {
                qpx.e(mapInteractor.f10931b, mapInteractor.f10931b.getResources().getString(R.string.IDS_update_download_failed));
            }
        }
    }
}
