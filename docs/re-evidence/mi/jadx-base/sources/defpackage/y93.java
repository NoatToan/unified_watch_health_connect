package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public interface y93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39946a = DisplayUtil.dip2px(1.65f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39947b = DisplayUtil.dip2px(1.0f);

    void a(Canvas canvas, RectF rectF);

    void b(Canvas canvas, RectF rectF, cdp cdpVar);

    void c(Canvas canvas, RectF rectF, LocalDate localDate);

    void d(Canvas canvas, RectF rectF, LocalDate localDate, boolean z);

    void e(Canvas canvas, RectF rectF, LocalDate localDate, boolean z);

    void f(Canvas canvas, RectF rectF, LocalDate localDate);
}
