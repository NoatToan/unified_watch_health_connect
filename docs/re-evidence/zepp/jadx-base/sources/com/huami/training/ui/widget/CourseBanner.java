package com.huami.training.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.youth.banner.WeakHandler;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import net.lucode.hackware.magicindicator.MagicIndicator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/huami/training/ui/widget/CourseBanner;", "Landroidx/viewpager/widget/ViewPager;", "", "delayTime", "", "a", "b", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "magicIndicator", "", "totalCount", "", "autoPlay", "bind", "stopAutoPlay", "", "Ljava/lang/String;", "TAG", LogUtil.I, "currentPosition", "c", "J", GoogleApiAvailabilityLight.a, "Z", "e", "Lcom/youth/banner/WeakHandler;", "f", "Lcom/youth/banner/WeakHandler;", "handler", "g", "isInit", "Ljava/lang/Runnable;", "h", "Lkotlin/Lazy;", "getTask", "()Ljava/lang/Runnable;", "task", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class CourseBanner extends ViewPager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int currentPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long delayTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean autoPlay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int totalCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final WeakHandler handler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isInit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy task;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/lang/Runnable;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Runnable> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CourseBanner courseBanner) {
            if (courseBanner.totalCount <= 1 || !courseBanner.autoPlay) {
                return;
            }
            courseBanner.currentPosition = (courseBanner.currentPosition + 1) % courseBanner.totalCount;
            Log.d(courseBanner.TAG, "totalCount=" + courseBanner.totalCount + "\tcurrentPosition=" + courseBanner.currentPosition);
            if (courseBanner.currentPosition == 0) {
                courseBanner.setCurrentItem(courseBanner.currentPosition, false);
            } else {
                courseBanner.setCurrentItem(courseBanner.currentPosition);
            }
            courseBanner.a(courseBanner.delayTime);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Runnable invoke() {
            final CourseBanner courseBanner = CourseBanner.this;
            return new Runnable() { // from class: com.huami.training.ui.widget.a
                @Override // java.lang.Runnable
                public final void run() {
                    CourseBanner.a.c(courseBanner);
                }
            };
        }
    }

    public CourseBanner(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "CourseBanner";
        this.delayTime = 2000L;
        this.handler = new WeakHandler();
        this.task = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long delayTime) {
        this.handler.postDelayed(getTask(), delayTime);
    }

    private final void b() {
        this.handler.removeCallbacks(getTask());
        a(this.delayTime);
    }

    private final Runnable getTask() {
        return (Runnable) this.task.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void bind(@NotNull final MagicIndicator magicIndicator, int totalCount, boolean autoPlay) {
        this.totalCount = totalCount;
        this.autoPlay = autoPlay;
        if (!this.isInit) {
            this.isInit = true;
            addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huami.training.ui.widget.CourseBanner.bind.1
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int state) {
                    magicIndicator.onPageScrollStateChanged(state);
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    magicIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int position) {
                    magicIndicator.onPageSelected(position);
                    this.currentPosition = position;
                }
            });
        }
        if (autoPlay) {
            b();
        }
    }

    public final void stopAutoPlay() {
        this.handler.removeCallbacks(getTask());
    }
}
