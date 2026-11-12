package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes10.dex */
public class ioa extends l2m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21940b;
    public int c;
    public int d;
    public int e;
    public int f;

    public ioa() {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nuniform mat4 uTexMatrix;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTextureOES, vTextureCoord);\n    //vec4 texOES = texture2D(sTextureOES, vTextureCoord);\n    //vec4 tex = texture2D(sTexture, vTextureCoord);\n    //gl_FragColor = mix(texOES, tex, 0.5);\n}\n");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f24572a, "uMVPMatrix");
        this.f21940b = iGlGetUniformLocation;
        xza.b(iGlGetUniformLocation, "uMVPMatrix");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f24572a, "aPosition");
        this.c = iGlGetAttribLocation;
        xza.b(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f24572a, "uTexMatrix");
        this.d = iGlGetUniformLocation2;
        xza.b(iGlGetUniformLocation2, "uTexMatrix");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f24572a, "aTextureCoord");
        this.e = iGlGetAttribLocation2;
        xza.b(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.f24572a, "sTextureOES");
        this.f = iGlGetUniformLocation3;
        xza.b(iGlGetUniformLocation3, "sTextureOES");
    }
}
