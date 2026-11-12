package com.xiaomi.hm.health.watermarkcamera.ui.fragment;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.watermarkcamera.R;
import com.xiaomi.hm.health.watermarkcamera.ui.widget.clip.ClipImageLayout;
import com.xiaomi.hm.health.watermarkcamera.utils.BitmapUtils;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkClipImageFragment extends Fragment {
    public static final String EXTRA_PATH_NAME = "pathname";
    public static final String SHARE_AREA_HEIGHT = "shareAreaHeight";
    public static final String SHARE_AREA_WIDTH = "shareAreaWidth";
    private static final String f = "WatermarkClipImageFragment";
    private ClipImageLayout a;
    private Bitmap b = null;
    private String c;
    private int d;
    private int e;

    private void a() {
        try {
            this.b = BitmapUtils.decodeSampledBitmapFromFile(this.c, this.d, this.e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            HMLog.i(f, "avatarBitmap = null", new Object[0]);
        } else {
            this.a.setimage(bitmap);
        }
    }

    public Bitmap getCropImage() {
        return this.a.clip();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_watermark_clip_image, viewGroup, false);
        this.c = getActivity().getIntent().getStringExtra(EXTRA_PATH_NAME);
        this.d = getActivity().getIntent().getIntExtra(SHARE_AREA_WIDTH, 0);
        this.e = getActivity().getIntent().getIntExtra(SHARE_AREA_HEIGHT, 0);
        this.a = (ClipImageLayout) viewInflate.findViewById(R.id.profile_view);
        a();
        return viewInflate;
    }
}
