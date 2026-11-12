package cj;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import dj.l;
import dj.m;
import dj.t;
import ui.g;
import ui.h;
import ui.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f27723a = t.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ui.b f27726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f27727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f27729g;

    /* JADX INFO: renamed from: cj.a$a, reason: collision with other inner class name */
    public class C0422a implements ImageDecoder.OnPartialImageListener {
        public C0422a(a aVar) {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i14, int i15, h hVar) {
        this.f27724b = i14;
        this.f27725c = i15;
        this.f27726d = (ui.b) hVar.c(m.f59847f);
        this.f27727e = (l) hVar.c(l.f59842f);
        g<Boolean> gVar = m.f59850i;
        this.f27728f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f27729g = (i) hVar.c(m.f59848g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        t tVar = this.f27723a;
        int width = this.f27724b;
        int height = this.f27725c;
        if (tVar.c(width, height, this.f27728f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f27726d == ui.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0422a(this));
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f27727e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f27729g;
        if (iVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
