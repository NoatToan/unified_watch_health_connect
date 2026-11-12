package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes10.dex */
public class i2o extends l2m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20711b;
    public int c;
    public int d;
    public int e;

    public i2o() {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f24572a, "uMVPMatrix");
        this.f20711b = iGlGetUniformLocation;
        xza.b(iGlGetUniformLocation, "uMVPMatrix");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f24572a, "aPosition");
        this.c = iGlGetAttribLocation;
        xza.b(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f24572a, "aTextureCoord");
        this.d = iGlGetAttribLocation2;
        xza.b(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f24572a, "sTexture");
        this.e = iGlGetUniformLocation2;
        xza.b(iGlGetUniformLocation2, "sTexture");
    }
}
