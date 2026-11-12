package com.huami.femalehealth.uilib.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huami.calendarview.Calendar;
import com.huami.calendarview.LunarCalendar;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.Milli;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.tools.analytics.DbUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\r\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u000b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u000b\u001a\u0014\u0010\u0016\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¨\u0006\u0017"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/graphics/drawable/Drawable;", "toDrawable", "Landroid/graphics/Matrix;", "matrix", "toBitmap", "Lcom/huami/femalehealth/logiclib/calculation/Milli;", "", "offsetDay", "Lcom/huami/calendarview/Calendar;", "toCalendar", "Ljava/util/Date;", "toDate", "", "getDayMillis", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "toDateTriple", "Lkotlin/Function0;", "", "func", "runOnUiThread", "uilib_release"}, k = 2, mv = {1, 5, 1})
public final class ExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.helper.ExtKt$runOnUiThread$1", f = "Ext.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final long getDayMillis(@NotNull Calendar calendar) {
        return DateHelper.INSTANCE.resetHour(calendar.getTimeInMillis());
    }

    public static final void runOnUiThread(@NotNull Function0<Unit> function0) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(function0, null), 2, null);
    }

    @Nullable
    public static final Bitmap toBitmap(@NotNull Drawable drawable, @Nullable Matrix matrix) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (matrix != null) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, intrinsicWidth, intrinsicHeight, matrix, true);
            intrinsicWidth = bitmapCreateBitmap2.getWidth();
            intrinsicHeight = bitmapCreateBitmap2.getHeight();
            bitmapCreateBitmap.recycle();
            bitmapCreateBitmap = bitmapCreateBitmap2;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, Matrix matrix, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = null;
        }
        return toBitmap(drawable, matrix);
    }

    @NotNull
    public static final Calendar toCalendar(@NotNull Milli milli, int i) {
        Calendar calendar = new Calendar();
        DateTriple dateTripleOffsetDay = DateHelper.INSTANCE.offsetDay(i, milli.getValue());
        calendar.setYear(dateTripleOffsetDay.getYear());
        calendar.setMonth(dateTripleOffsetDay.getMonth());
        calendar.setDay(dateTripleOffsetDay.getDay());
        try {
            LunarCalendar.setupLunarCalendar(calendar);
        } catch (Exception unused) {
        }
        return calendar;
    }

    public static /* synthetic */ Calendar toCalendar$default(Milli milli, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return toCalendar(milli, i);
    }

    @NotNull
    public static final Date toDate(@NotNull Calendar calendar) {
        return new Date(getDayMillis(calendar));
    }

    @NotNull
    public static final DateTriple toDateTriple(@NotNull Calendar calendar) {
        return new DateTriple(calendar.getYear(), calendar.getMonth(), calendar.getDay());
    }

    @NotNull
    public static final Drawable toDrawable(@NotNull Bitmap bitmap, @Nullable Context context) {
        if (context == null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            bitmapDrawable.setBounds(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
            return bitmapDrawable;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), bitmap);
        bitmapDrawable2.setBounds(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        return bitmapDrawable2;
    }

    public static /* synthetic */ Drawable toDrawable$default(Bitmap bitmap, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return toDrawable(bitmap, context);
    }

    @NotNull
    public static final Calendar toCalendar(@NotNull Date date) {
        return toCalendar$default(new Milli(date.getTime()), 0, 1, null);
    }

    @NotNull
    public static final Calendar toCalendar(@NotNull DateTriple dateTriple) {
        return toCalendar$default(AidKt.toMilli(dateTriple), 0, 1, null);
    }
}
