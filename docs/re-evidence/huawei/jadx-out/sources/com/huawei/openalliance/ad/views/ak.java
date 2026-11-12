package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes41.dex */
public class ak extends b {
    private final int y;
    private SurfaceHolder.Callback z;

    @Override // com.huawei.openalliance.ad.views.b
    protected String getLogTag() {
        return "SurfaceVideoView" + this.y;
    }

    private void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_surfaceview_video, this);
        ((SurfaceView) findViewById(R.id.hiad_id_video_surface_view)).getHolder().addCallback(this.z);
    }

    public ak(Context context) {
        super(context);
        this.y = hashCode();
        this.z = new SurfaceHolder.Callback() { // from class: com.huawei.openalliance.ad.views.ak.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                ak.this.e();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                hw.b(ak.this.getLogTag(), "surfaceCreated");
                ak.this.a(surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                ak.this.b(i2, i3);
            }
        };
        b(context);
    }
}
