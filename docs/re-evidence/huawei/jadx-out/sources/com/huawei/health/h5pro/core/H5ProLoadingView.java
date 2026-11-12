package com.huawei.health.h5pro.core;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bumptech.glide.Glide;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.webkit.FileDownloadManager;
import com.huawei.health.h5pro.webkit.HpkManager;
import defpackage.exi;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProLoadingView extends RelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6735c;
    private final RelativeLayout d;
    private final ImageView e;

    public H5ProLoadingView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final H5ProInstance h5ProInstance) throws Throwable {
        HpkManager hpkManager = HpkManager.e;
        String versionFilePath = hpkManager.getVersionFilePath(getContext(), str);
        if (FileDownloadManager.exists(versionFilePath)) {
            d(FileDownloadManager.readFileContent(getContext(), versionFilePath), str, h5ProInstance);
        } else {
            FileDownloadManager.download(hpkManager.getVersionDownloadUrl(str), new File(hpkManager.getH5WorkPath(getContext(), str), hpkManager.getVersionFileName(str)), new FileDownloadManager.DownloadCallback() { // from class: com.huawei.health.h5pro.core.H5ProLoadingView.5
                @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("H5PRO_H5ProLoadingView", "initH5MiniProgramLoadingView: onFailure -> " + i + " - " + str2);
                    H5ProLoadingView.this.d("", "", h5ProInstance);
                }

                @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
                public void onSuccess(File file) {
                    H5ProLoadingView h5ProLoadingView = H5ProLoadingView.this;
                    h5ProLoadingView.d(FileDownloadManager.readFileContent(h5ProLoadingView.getContext(), file), str, h5ProInstance);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, H5ProInstance h5ProInstance) {
        if (TextUtils.isEmpty(str)) {
            e(null, h5ProInstance);
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("loading");
            exi exiVar = jSONObjectOptJSONObject == null ? null : (exi) GsonUtil.parseJson(jSONObjectOptJSONObject.toString(), exi.class);
            if (exiVar != null) {
                exiVar.a(str2);
            }
            e(exiVar, h5ProInstance);
        } catch (JSONException e) {
            LogUtil.e("H5PRO_H5ProLoadingView", b.a(e, new StringBuilder("parsingConfigData: exception -> ")));
            e(null, h5ProInstance);
        }
    }

    private void e(final exi exiVar, final H5ProInstance h5ProInstance) {
        if (this.f6735c) {
            return;
        }
        post(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProLoadingView.3
            @Override // java.lang.Runnable
            public void run() {
                H5ProInstance h5ProInstance2;
                if (H5ProLoadingView.this.f6735c || (h5ProInstance2 = h5ProInstance) == null || h5ProInstance2.isLoaded()) {
                    LogUtil.i("H5PRO_H5ProLoadingView", "showH5MiniProgramLoadingView - > h5ProInstance is null or loaded.");
                    return;
                }
                exi exiVar2 = exiVar;
                if (exiVar2 == null || TextUtils.isEmpty(exiVar2.d())) {
                    H5ProLoadingView.this.e.setVisibility(8);
                    H5ProLoadingView.this.d.setVisibility(0);
                    return;
                }
                String strC = exiVar.c();
                if (!TextUtils.isEmpty(strC)) {
                    H5ProLoadingView.this.setBackgroundColor(Color.parseColor(strC));
                }
                H5ProLoadingView.this.d.setVisibility(8);
                H5ProLoadingView.this.e.setVisibility(0);
                Glide.with(H5ProLoadingView.this.getContext()).load(exiVar.d()).into(H5ProLoadingView.this.e);
            }
        });
    }

    public void initLoadingView(H5ProCommand h5ProCommand, H5ProInstance h5ProInstance) {
        final String packageName = h5ProCommand.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            final WeakReference weakReference = new WeakReference(h5ProInstance);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProLoadingView.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    final boolean zHasNewVersion = HpkManager.e.hasNewVersion(H5ProLoadingView.this.getContext(), packageName);
                    H5ProLoadingView.this.post(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProLoadingView.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            H5ProInstance h5ProInstance2 = (H5ProInstance) GeneralUtil.getReferent(weakReference);
                            if (h5ProInstance2 == null || h5ProInstance2.isLoaded()) {
                                LogUtil.i("H5PRO_H5ProLoadingView", "initLoadingView - > h5ProInstance is null or loaded.");
                                return;
                            }
                            H5ProLoadingView.this.d.setVisibility(8);
                            H5ProLoadingView.this.e.setVisibility(zHasNewVersion ? 0 : 8);
                            H5ProLoadingView.this.setVisibility(zHasNewVersion ? 0 : 8);
                        }
                    });
                    if (zHasNewVersion) {
                        H5ProLoadingView.this.a(packageName, (H5ProInstance) GeneralUtil.getReferent(weakReference));
                    }
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
            return;
        }
        if (TextUtils.isEmpty(h5ProCommand.getUrl())) {
            setVisibility(8);
            return;
        }
        this.e.setVisibility(8);
        this.d.setVisibility(0);
        setVisibility(0);
    }

    public void onDestroy() {
        this.f6735c = true;
    }

    public H5ProLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public H5ProLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6735c = false;
        View viewInflate = View.inflate(context, R.layout.view_h5pro_loading, null);
        this.e = (ImageView) viewInflate.findViewById(R.id.iv_bgView);
        this.d = (RelativeLayout) viewInflate.findViewById(R.id.rl_defLoadingView);
        addView(viewInflate);
    }
}
