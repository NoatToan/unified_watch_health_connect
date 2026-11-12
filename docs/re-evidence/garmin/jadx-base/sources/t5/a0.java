package t5;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt5/a0;", "Landroid/graphics/Canvas;", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f162400a;

    public final Canvas a() {
        Canvas canvas = this.f162400a;
        if (canvas != null) {
            return canvas;
        }
        y5.a.d("Text drawing wrapper is missing a Canvas!");
        o2.c.f();
        return null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        g gVar = g.f162426a;
        Canvas canvasA = a();
        gVar.getClass();
        return canvasA.clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        g gVar = g.f162426a;
        Canvas canvasA = a();
        gVar.getClass();
        return canvasA.clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final boolean clipPath(Path path, Region.Op op3) {
        return a().clipPath(path, op3);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final boolean clipRect(float f14, float f15, float f16, float f17, Region.Op op3) {
        return a().clipRect(f14, f15, f16, f17, op3);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i14, int i15, int i16, int i17) {
        a().drawARGB(i14, i15, i16, i17);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f14, float f15, float f16, float f17, float f18, float f19, boolean z14, Paint paint) {
        a().drawArc(f14, f15, f16, f17, f18, f19, z14, paint);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final void drawBitmap(int[] iArr, int i14, int i15, float f14, float f15, int i16, int i17, boolean z14, Paint paint) {
        a().drawBitmap(iArr, i14, i15, f14, f15, i16, i17, z14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i14, int i15, float[] fArr, int i16, int[] iArr, int i17, Paint paint) {
        a().drawBitmapMesh(bitmap, i14, i15, fArr, i16, iArr, i17, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f14, float f15, float f16, Paint paint) {
        a().drawCircle(f14, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j8) {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.drawColor(j8);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f14, float f15, RectF rectF2, float f16, float f17, Paint paint) {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.drawDoubleRoundRect(rectF, f14, f15, rectF2, f16, f17, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i14, float[] fArr, int i15, int i16, Font font, Paint paint) {
        j jVar = j.f162429a;
        Canvas canvasA = a();
        jVar.getClass();
        canvasA.drawGlyphs(iArr, i14, fArr, i15, i16, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f14, float f15, float f16, float f17, Paint paint) {
        a().drawLine(f14, f15, f16, f17, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i14, int i15, Paint paint) {
        a().drawLines(fArr, i14, i15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f14, float f15, float f16, float f17, Paint paint) {
        a().drawOval(f14, f15, f16, f17, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        j jVar = j.f162429a;
        Canvas canvasA = a();
        jVar.getClass();
        canvasA.drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f14, float f15, Paint paint) {
        a().drawPoint(f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i14, int i15, Paint paint) {
        a().drawPoints(fArr, i14, i15, paint);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final void drawPosText(char[] cArr, int i14, int i15, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i14, i15, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i14, int i15, int i16) {
        a().drawRGB(i14, i15, i16);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f14, float f15, float f16, float f17, Paint paint) {
        a().drawRect(f14, f15, f16, f17, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f14, float f15, float f16, float f17, float f18, float f19, Paint paint) {
        a().drawRoundRect(f14, f15, f16, f17, f18, f19, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i14, int i15, float f14, float f15, Paint paint) {
        a().drawText(cArr, i14, i15, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i14, int i15, Path path, float f14, float f15, Paint paint) {
        a().drawTextOnPath(cArr, i14, i15, path, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i14, int i15, int i16, int i17, float f14, float f15, boolean z14, Paint paint) {
        f fVar = f.f162425a;
        Canvas canvasA = a();
        fVar.getClass();
        canvasA.drawTextRun(cArr, i14, i15, i16, i17, f14, f15, z14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i14, float[] fArr, int i15, float[] fArr2, int i16, int[] iArr, int i17, short[] sArr, int i18, int i19, Paint paint) {
        a().drawVertices(vertexMode, i14, fArr, i15, fArr2, i16, iArr, i17, sArr, i18, i19, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        i iVar = i.f162428a;
        Canvas canvasA = a();
        iVar.getClass();
        return canvasA.quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i14) {
        a().restoreToCount(i14);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f14) {
        a().rotate(f14);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final int saveLayer(float f14, float f15, float f16, float f17, Paint paint, int i14) {
        return a().saveLayer(f14, f15, f16, f17, paint, i14);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final int saveLayerAlpha(float f14, float f15, float f16, float f17, int i14, int i15) {
        return a().saveLayerAlpha(f14, f15, f16, f17, i14, i15);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f14, float f15) {
        a().scale(f14, f15);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i14) {
        a().setDensity(i14);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f14, float f15) {
        a().skew(f14, f15);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f14, float f15) {
        a().translate(f14, f15);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i14) {
        a().drawColor(i14);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        j jVar = j.f162429a;
        Canvas canvasA = a();
        jVar.getClass();
        canvasA.drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        g gVar = g.f162426a;
        Canvas canvasA = a();
        gVar.getClass();
        return canvasA.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final boolean clipRect(Rect rect, Region.Op op3) {
        return a().clipRect(rect, op3);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i14, PorterDuff.Mode mode) {
        a().drawColor(i14, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f14, float f15, Paint paint) {
        a().drawText(str, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i14, BlendMode blendMode) {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.drawColor(i14, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f14, float f15, Paint paint) {
        a().drawRoundRect(rectF, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i14, int i15, float f14, float f15, Paint paint) {
        a().drawText(str, i14, i15, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f14, float f15, Paint paint) {
        a().drawTextOnPath(str, path, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i14) {
        return a().saveLayerAlpha(rectF, i14);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f14, float f15, float f16, float f17) {
        g gVar = g.f162426a;
        Canvas canvasA = a();
        gVar.getClass();
        return canvasA.clipOutRect(f14, f15, f16, f17);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i14, int i15, float f14, float f15, Paint paint) {
        a().drawText(charSequence, i14, i15, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        i iVar = i.f162428a;
        Canvas canvasA = a();
        iVar.getClass();
        return canvasA.quickReject(path);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final int saveLayer(RectF rectF, Paint paint, int i14) {
        return a().saveLayer(rectF, paint, i14);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final int saveLayerAlpha(RectF rectF, int i14, int i15) {
        return a().saveLayerAlpha(rectF, i14, i15);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final boolean clipRect(RectF rectF, Region.Op op3) {
        return a().clipRect(rectF, op3);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j8, BlendMode blendMode) {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.drawColor(j8, blendMode);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f14, float f15, float f16, float f17, Paint paint) {
        return a().saveLayer(f14, f15, f16, f17, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f14, float f15, float f16, float f17, int i14) {
        return a().saveLayerAlpha(f14, f15, f16, f17, i14);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i14, int i15, int i16, int i17) {
        g gVar = g.f162426a;
        Canvas canvasA = a();
        gVar.getClass();
        return canvasA.clipOutRect(i14, i15, i16, i17);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f14, float f15, float f16, float f17) {
        return a().clipRect(f14, f15, f16, f17);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f14, float f15, boolean z14, Paint paint) {
        a().drawArc(rectF, f14, f15, z14, paint);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final boolean quickReject(float f14, float f15, float f16, float f17, Canvas.EdgeType edgeType) {
        return a().quickReject(f14, f15, f16, f17, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i14, int i15, int i16, int i17) {
        return a().clipRect(i14, i15, i16, i17);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f14, float f15, float f16, float f17) {
        i iVar = i.f162428a;
        Canvas canvasA = a();
        iVar.getClass();
        return canvasA.quickReject(f14, f15, f16, f17);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f14, float f15, Paint paint) {
        a().drawBitmap(bitmap, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    @o13.e
    public final void drawBitmap(int[] iArr, int i14, int i15, int i16, int i17, int i18, int i19, boolean z14, Paint paint) {
        a().drawBitmap(iArr, i14, i15, i16, i17, i18, i19, z14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i14, int i15, int i16, int i17, float f14, float f15, boolean z14, Paint paint) {
        f fVar = f.f162425a;
        Canvas canvasA = a();
        fVar.getClass();
        canvasA.drawTextRun(charSequence, i14, i15, i16, i17, f14, f15, z14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i14, int i15, int i16, int i17, float f14, float f15, boolean z14, Paint paint) {
        h hVar = h.f162427a;
        Canvas canvasA = a();
        hVar.getClass();
        canvasA.drawTextRun(measuredText, i14, i15, i16, i17, f14, f15, z14, paint);
    }
}
