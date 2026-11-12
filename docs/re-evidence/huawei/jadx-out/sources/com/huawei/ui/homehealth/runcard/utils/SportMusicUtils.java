package com.huawei.ui.homehealth.runcard.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.View;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.homehealth.R;
import defpackage.izn;
import defpackage.izw;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.lsj;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SportMusicUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25980b;

    public SportMusicUtils(Context context) {
        this.f25980b = context.getApplicationContext();
    }

    public void b(jaq jaqVar, int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (jaqVar == null || iBaseResponseCallback == null) {
            LogUtil.j("Track_SportMusicUtils", "preferenceUtil or loadMusicCallback is null.");
        } else {
            qqf.a(jaqVar.d(i), new CustomTarget<Bitmap>() { // from class: com.huawei.ui.homehealth.runcard.utils.SportMusicUtils.4
                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                    if (bitmap == null) {
                        if (SportMusicUtils.this.f25980b != null) {
                            iBaseResponseCallback.a(100001, null);
                            return;
                        }
                        return;
                    }
                    SportMusicUtils.this.new e(bitmap, iBaseResponseCallback).execute(new Void[0]);
                }

                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                    LogUtil.a("Track_SportMusicUtils", "loadMusicElement onLoadCleared");
                }
            });
        }
    }

    class e extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IBaseResponseCallback f25986b;
        private Bitmap e;

        e(Bitmap bitmap, IBaseResponseCallback iBaseResponseCallback) {
            this.e = bitmap;
            this.f25986b = iBaseResponseCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) {
            float fA = qqp.a(SportMusicUtils.this.f25980b, 56.0f) / Math.min(this.e.getWidth(), this.e.getHeight());
            Matrix matrix = new Matrix();
            matrix.postScale(fA, fA);
            Bitmap bitmap = this.e;
            Bitmap bitmapA = qqf.a(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.e.getHeight(), matrix, true));
            SportMusicUtils sportMusicUtils = SportMusicUtils.this;
            return sportMusicUtils.d(bitmapA, sportMusicUtils.f25980b);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            this.f25986b.a(100000, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap d(Bitmap bitmap, Context context) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paintC = c();
        paintC.setStyle(Paint.Style.FILL);
        paintC.setColor(-1);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, bitmap.getWidth() / 2.0f, paintC);
        int width = bitmap.getWidth() - qqp.a(context, 4.0f);
        float f = width;
        float width2 = f / bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.setScale(width2, width2);
        matrix.postTranslate((bitmap.getWidth() - width) / 2.0f, (bitmap.getHeight() - width) / 2.0f);
        canvas.drawBitmap(bitmap, matrix, c());
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_sport_music_icon);
        float width3 = f / bitmapDecodeResource.getWidth();
        matrix.setScale(width3, width3);
        matrix.postTranslate((bitmap.getWidth() - width) / 2.0f, (bitmap.getHeight() - width) / 2.0f);
        canvas.drawBitmap(bitmapDecodeResource, matrix, c());
        return bitmapCreateBitmap;
    }

    private Paint c() {
        return new Paint() { // from class: com.huawei.ui.homehealth.runcard.utils.SportMusicUtils.3
            {
                setAntiAlias(true);
                setDither(true);
                setFilterBitmap(true);
            }
        };
    }

    public Map<String, Object> a(Map<String, Object> map, int i) {
        if (a(BaseApplication.getActivity())) {
            return map;
        }
        try {
            Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
            intent.setFlags(268435456);
            if (izn.e() && CommonUtil.w(izw.p)) {
                intent.setPackage(izw.p);
                if (jaa.f(this.f25980b)) {
                    LogUtil.a("Track_SportMusicUtils", "gotoSportMusic MUSIC_PLAYER");
                    SportMusicController.c().d(0, i, false);
                    map.put("sportMusicType", 0);
                    map.put("click", 1);
                    map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 0);
                    map.put("musicType", Integer.valueOf(jaa.f(this.f25980b) ? 4 : 0));
                    map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i));
                    return map;
                }
                qrs.c(intent, izw.p, this.f25980b, qre.f(com.huawei.ecologydevice.R.string.IDS_hwh_motiontrack_music));
            }
        } catch (ActivityNotFoundException e2) {
            LogUtil.j("Track_SportMusicUtils", "Not found this activity MUSIC_PLAYER ", e2.getMessage());
        }
        map.put("sportMusicType", 0);
        return map;
    }

    public static boolean a(Context context) {
        boolean zC = lsj.c(context, CommonUtil.ac());
        if (!zC) {
            e(context);
        }
        return !zC;
    }

    private static void e(final Context context) {
        if (!(context instanceof Activity)) {
            LogUtil.j("Track_SportMusicUtils", "showInstallHwMusic context is not activity context.");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(com.huawei.ui.commonui.R.string.IDS_hw_health_music_huawei_music_not_installed)).a(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: szv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_SportMusicUtils", "showInstallHwMusic cancel");
            }
        }).c(com.huawei.ui.commonui.R.string.IDS_compatibility_note_open, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.utils.SportMusicUtils$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportMusicUtils.c(context, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void c(Context context, View view) {
        LogUtil.a("Track_SportMusicUtils", "showInstallHwMusic onClick");
        Intent intent = new Intent("com.huawei.appmarket.intent.action.AppDetail");
        intent.setPackage("com.huawei.appmarket");
        intent.putExtra("APP_PACKAGENAME", "com.huawei.music");
        qrs.a(intent, "com.huawei.music", context);
    }
}
