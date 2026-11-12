package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes2.dex */
public class pvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RenderScript f30836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScriptIntrinsicBlur f30837b;
    public Allocation c;
    public Allocation d;

    public void a(Bitmap bitmap, Bitmap bitmap2) {
        this.c.copyFrom(bitmap);
        this.f30837b.setInput(this.c);
        this.f30837b.forEach(this.d);
        this.d.copyTo(bitmap2);
    }

    public void b(Context context, Bitmap bitmap, float f) {
        if (this.f30836a == null) {
            try {
                RenderScript renderScriptCreate = RenderScript.create(context);
                this.f30836a = renderScriptCreate;
                this.f30837b = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            } catch (RSRuntimeException unused) {
                c();
                return;
            }
        }
        this.f30837b.setRadius(f);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f30836a, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.c = allocationCreateFromBitmap;
        this.d = Allocation.createTyped(this.f30836a, allocationCreateFromBitmap.getType());
    }

    public void c() {
        Allocation allocation = this.c;
        if (allocation != null) {
            allocation.destroy();
            this.c = null;
        }
        Allocation allocation2 = this.d;
        if (allocation2 != null) {
            allocation2.destroy();
            this.d = null;
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f30837b;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f30837b = null;
        }
        RenderScript renderScript = this.f30836a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f30836a = null;
        }
    }
}
