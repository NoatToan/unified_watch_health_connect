package com.xiaomi.fitness.watch.face.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.iki;
import defpackage.p1j;
import defpackage.x44;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/FaceWaterMarkView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "userId", "", "paint", "Landroid/graphics/Paint;", "needWaterMark", "", "setWaterMark", "", "need", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceWaterMarkView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceWaterMarkView.kt\ncom/xiaomi/fitness/watch/face/view/FaceWaterMarkView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1872#2,2:66\n1863#2,2:68\n1874#2:70\n*S KotlinDebug\n*F\n+ 1 FaceWaterMarkView.kt\ncom/xiaomi/fitness/watch/face/view/FaceWaterMarkView\n*L\n52#1:66,2\n53#1:68,2\n52#1:70\n*E\n"})
public final class FaceWaterMarkView extends View {
    private boolean needWaterMark;

    @NotNull
    private final Paint paint;

    @NotNull
    private final String userId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceWaterMarkView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void init() {
        this.paint.setAntiAlias(true);
        this.paint.setTextSize(18.0f);
        this.paint.setColor(x44.a(iki.m));
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.needWaterMark) {
            canvas.save();
            canvas.rotate(-30.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            String str = this.userId + "-" + ResourceExtKt.getString(p1j.y2);
            int iMeasureText = (int) this.paint.measureText(str);
            int iDescent = ((int) (this.paint.descent() - this.paint.ascent())) * 5;
            int i = iMeasureText * 3;
            int width = (int) (getWidth() / ((float) Math.sqrt(3.0f)));
            Iterator<Integer> it = RangesKt___RangesKt.step(new IntRange(-width, getHeight() + width), iDescent).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Iterator<Integer> it2 = RangesKt___RangesKt.step(new IntRange((-getWidth()) * 2, getWidth() * 2), i).iterator();
                while (it2.hasNext()) {
                    canvas.drawText(str, ((IntIterator) it2).nextInt() - ((i2 % 3) * iMeasureText), iNextInt, this.paint);
                }
                i2 = i3;
            }
            canvas.restore();
        }
    }

    public final void setWaterMark(boolean need) {
        this.needWaterMark = need;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceWaterMarkView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FaceWaterMarkView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceWaterMarkView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        this.paint = new Paint();
        init();
    }
}
