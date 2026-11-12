package defpackage;

import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.beans.TitleBean;
import com.huawei.pluginsocialshare.R;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f45586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f45587c;
    public static final Map<Integer, Integer> d;
    public static final String e = lrp.f40730c;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String v;

    static {
        String absolutePath = BaseApplication.getContext().getFilesDir().getAbsolutePath();
        f = absolutePath;
        f45587c = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + WatchFaceProvider.BACKGROUND_LABEL;
        m = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + "sport" + File.separator + WatchFaceProvider.BACKGROUND_LABEL;
        p = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + "sport" + File.separator + "thumbnail_background";
        l = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + "sport" + File.separator + "sticker";
        f45585a = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + CardMgrSdkConst.KEY_RECOMMEND;
        v = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + "watermark";
        s = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + "sticker";
        String str = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + "json";
        h = str;
        String str2 = absolutePath + File.separator + "plugins" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + "sport" + File.separator + "json";
        k = str2;
        o = str2 + File.separator + "share_index_download.json";
        j = str + File.separator + "share_index_download.json";
        i = str2 + File.separator + "background_download.json";
        n = str2 + File.separator + "sticker_download.json";
        f45586b = str + File.separator + "background_download.json";
        q = str + File.separator + "themebackground_download.json";
        g = str + File.separator + "recommend_download.json";
        r = str + File.separator + "watermark_download.json";
        t = str + File.separator + "sticker_download.json";
        d = Collections.unmodifiableMap(new HashMap<Integer, Integer>() { // from class: pld.4
            private static final long serialVersionUID = -7918315086085509155L;

            {
                put(Integer.valueOf(R.drawable.share_geometry_1), 8);
                put(Integer.valueOf(R.drawable.share_geometry_2), 9);
                put(Integer.valueOf(R.drawable.share_geometry_3), 10);
                put(Integer.valueOf(R.drawable.share_run_default_background), 2);
                put(Integer.valueOf(R.drawable.share_cycling_default_background), 11);
                put(Integer.valueOf(R.drawable.basketball_background_default), 20);
                put(Integer.valueOf(R.drawable.climb_hill_background_default), 13);
                put(Integer.valueOf(R.drawable.swim_background_default), 21);
                put(Integer.valueOf(R.drawable.fitness_background_1), 22);
            }
        });
    }
}
