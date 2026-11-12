package com.huawei.healthcloud.plugintrack.ui.view.glrender.filter;

import android.content.Context;
import android.opengl.GLES20;
import com.huawei.healthcloud.plugintrack.R;
import defpackage.jsw;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes10.dex */
public class CameraFilter extends jsw {
    private float[] q;
    protected float[] r;
    protected int t;

    @Override // defpackage.jsw, defpackage.jsv
    public void e() {
    }

    public CameraFilter(Context context) {
        super(context, R.raw.camera_vertex, R.raw.camera_frag);
        this.t = GLES20.glGetUniformLocation(this.n, "uMVPMatrix");
    }

    @Override // defpackage.jsv
    public int c(int i) {
        GLES20.glViewport(0, 0, this.j, this.i);
        GLES20.glBindFramebuffer(36160, this.f38990c[0]);
        GLES20.glUseProgram(this.n);
        this.g.position(0);
        GLES20.glVertexAttribPointer(this.o, 2, 5126, false, 0, (Buffer) this.g);
        GLES20.glEnableVertexAttribArray(this.o);
        this.h.position(0);
        GLES20.glVertexAttribPointer(this.f38988b, 2, 5126, false, 0, (Buffer) this.h);
        GLES20.glEnableVertexAttribArray(this.f38988b);
        GLES20.glUniformMatrix4fv(this.f, 1, false, this.r, 0);
        GLES20.glUniformMatrix4fv(this.t, 1, false, this.q, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.k, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(36197, 0);
        return this.d[0];
    }

    public void c(float[] fArr) {
        if (fArr != null) {
            this.r = (float[]) fArr.clone();
        }
    }

    public void b(float[] fArr) {
        if (fArr != null) {
            this.q = (float[]) fArr.clone();
        }
    }
}
