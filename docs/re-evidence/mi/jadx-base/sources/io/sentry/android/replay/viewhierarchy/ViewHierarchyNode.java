package io.sentry.android.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import io.sentry.SentryOptions;
import io.sentry.android.replay.a;
import io.sentry.android.replay.util.AndroidTextLayout;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 32\u00020\u0001:\u000534567Bm\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0002J\u000e\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0000J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fJ\u001a\u00100\u001a\u00020.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f02R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b\u0082\u0001\u000389:¨\u0006;"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "", "x", "", "y", "width", "", "height", BizTypeConstants.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "children", "", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getDistance", "()I", "getElevation", "()F", "getHeight", "()Z", "setImportantForContentCapture", "(Z)V", "getParent", "()Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "getShouldMask", "getVisibleRect", "()Landroid/graphics/Rect;", "getWidth", "getX", "getY", "findLCA", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "node", "otherNode", "isObscured", "setImportantForCaptureToAncestors", "", "isImportant", "traverse", "callback", "Lkotlin/Function1;", "Companion", "GenericViewHierarchyNode", "ImageViewHierarchyNode", "LCAResult", "TextViewHierarchyNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n1855#2,2:351\n*S KotlinDebug\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode\n*L\n108#1:351,2\n*E\n"})
public abstract class ViewHierarchyNode {

    @NotNull
    private static final String SENTRY_MASK_TAG = "sentry-mask";

    @NotNull
    private static final String SENTRY_UNMASK_TAG = "sentry-unmask";

    @Nullable
    private List<? extends ViewHierarchyNode> children;
    private final int distance;
    private final float elevation;
    private final int height;
    private boolean isImportantForContentCapture;
    private final boolean isVisible;

    @Nullable
    private final ViewHierarchyNode parent;
    private final boolean shouldMask;

    @Nullable
    private final Rect visibleRect;
    private final int width;
    private final float x;
    private final float y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0002J\u0014\u0010\u0014\u001a\u00020\u0010*\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0015\u001a\u00020\u0010*\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0017\u001a\u00020\u0010*\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$Companion;", "", "()V", "SENTRY_MASK_TAG", "", "SENTRY_UNMASK_TAG", "fromView", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "view", "Landroid/view/View;", "parent", "distance", "", "options", "Lio/sentry/SentryOptions;", "isAssignableFrom", "", "Ljava/lang/Class;", CourseConfigModel.DevCmd.CMD_ACTION_SET, "", "isMaskContainer", "isUnmaskContainer", "Landroid/view/ViewParent;", "shouldMask", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1#2:351\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isAssignableFrom(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean isMaskContainer(View view, SentryOptions sentryOptions) {
            String strF = sentryOptions.getExperimental().a().f();
            if (strF == null) {
                return false;
            }
            return Intrinsics.areEqual(view.getClass().getName(), strF);
        }

        private final boolean isUnmaskContainer(ViewParent viewParent, SentryOptions sentryOptions) {
            String strM = sentryOptions.getExperimental().a().m();
            if (strM == null) {
                return false;
            }
            return Intrinsics.areEqual(viewParent.getClass().getName(), strM);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0028  */
        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        /* JADX WARN: Code duplicated, block: B:18:0x003f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0068  */
        /* JADX WARN: Code duplicated, block: B:31:0x006e  */
        /* JADX WARN: Code duplicated, block: B:35:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x009f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
        private final boolean shouldMask(View view, SentryOptions sentryOptions) {
            Object tag;
            String str;
            Class<?> cls;
            Set<String> setL;
            ViewParent parent;
            String lowerCase;
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (lowerCase2 == null || !StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) ViewHierarchyNode.SENTRY_UNMASK_TAG, false, 2, (Object) null)) {
                    if (!Intrinsics.areEqual(view.getTag(a.f21630a), "unmask")) {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (lowerCase != null || !StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) ViewHierarchyNode.SENTRY_MASK_TAG, false, 2, (Object) null)) {
                                if (!Intrinsics.areEqual(view.getTag(a.f21630a), "mask")) {
                                    if (!isMaskContainer(view, sentryOptions) && view.getParent() != null) {
                                        parent = view.getParent();
                                        Intrinsics.checkNotNullExpressionValue(parent, "this.parent");
                                        if (isUnmaskContainer(parent, sentryOptions)) {
                                            return false;
                                        }
                                    }
                                    cls = view.getClass();
                                    setL = sentryOptions.getExperimental().a().l();
                                    Intrinsics.checkNotNullExpressionValue(setL, "options.experimental.ses…nReplay.unmaskViewClasses");
                                    if (isAssignableFrom(cls, setL)) {
                                        return false;
                                    }
                                    Class<?> cls2 = view.getClass();
                                    Set<String> setE = sentryOptions.getExperimental().a().e();
                                    Intrinsics.checkNotNullExpressionValue(setE, "options.experimental.sessionReplay.maskViewClasses");
                                    return isAssignableFrom(cls2, setE);
                                }
                            }
                        } else if (!Intrinsics.areEqual(view.getTag(a.f21630a), "mask")) {
                            if (!isMaskContainer(view, sentryOptions)) {
                                parent = view.getParent();
                                Intrinsics.checkNotNullExpressionValue(parent, "this.parent");
                                if (isUnmaskContainer(parent, sentryOptions)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setL = sentryOptions.getExperimental().a().l();
                            Intrinsics.checkNotNullExpressionValue(setL, "options.experimental.ses…nReplay.unmaskViewClasses");
                            if (isAssignableFrom(cls, setL)) {
                                return false;
                            }
                            Class<?> cls3 = view.getClass();
                            Set<String> setE2 = sentryOptions.getExperimental().a().e();
                            Intrinsics.checkNotNullExpressionValue(setE2, "options.experimental.sessionReplay.maskViewClasses");
                            return isAssignableFrom(cls3, setE2);
                        }
                        return true;
                    }
                }
            } else if (!Intrinsics.areEqual(view.getTag(a.f21630a), "unmask")) {
                tag = view.getTag();
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (lowerCase != null) {
                        if (!Intrinsics.areEqual(view.getTag(a.f21630a), "mask")) {
                            if (!isMaskContainer(view, sentryOptions)) {
                                parent = view.getParent();
                                Intrinsics.checkNotNullExpressionValue(parent, "this.parent");
                                if (isUnmaskContainer(parent, sentryOptions)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setL = sentryOptions.getExperimental().a().l();
                            Intrinsics.checkNotNullExpressionValue(setL, "options.experimental.ses…nReplay.unmaskViewClasses");
                            if (isAssignableFrom(cls, setL)) {
                                return false;
                            }
                            Class<?> cls4 = view.getClass();
                            Set<String> setE3 = sentryOptions.getExperimental().a().e();
                            Intrinsics.checkNotNullExpressionValue(setE3, "options.experimental.sessionReplay.maskViewClasses");
                            return isAssignableFrom(cls4, setE3);
                        }
                    } else if (!Intrinsics.areEqual(view.getTag(a.f21630a), "mask")) {
                        if (!isMaskContainer(view, sentryOptions)) {
                            parent = view.getParent();
                            Intrinsics.checkNotNullExpressionValue(parent, "this.parent");
                            if (isUnmaskContainer(parent, sentryOptions)) {
                                return false;
                            }
                        }
                        cls = view.getClass();
                        setL = sentryOptions.getExperimental().a().l();
                        Intrinsics.checkNotNullExpressionValue(setL, "options.experimental.ses…nReplay.unmaskViewClasses");
                        if (isAssignableFrom(cls, setL)) {
                            return false;
                        }
                        Class<?> cls5 = view.getClass();
                        Set<String> setE4 = sentryOptions.getExperimental().a().e();
                        Intrinsics.checkNotNullExpressionValue(setE4, "options.experimental.sessionReplay.maskViewClasses");
                        return isAssignableFrom(cls5, setE4);
                    }
                } else if (!Intrinsics.areEqual(view.getTag(a.f21630a), "mask")) {
                    if (!isMaskContainer(view, sentryOptions)) {
                        parent = view.getParent();
                        Intrinsics.checkNotNullExpressionValue(parent, "this.parent");
                        if (isUnmaskContainer(parent, sentryOptions)) {
                            return false;
                        }
                    }
                    cls = view.getClass();
                    setL = sentryOptions.getExperimental().a().l();
                    Intrinsics.checkNotNullExpressionValue(setL, "options.experimental.ses…nReplay.unmaskViewClasses");
                    if (isAssignableFrom(cls, setL)) {
                        return false;
                    }
                    Class<?> cls6 = view.getClass();
                    Set<String> setE5 = sentryOptions.getExperimental().a().e();
                    Intrinsics.checkNotNullExpressionValue(setE5, "options.experimental.sessionReplay.maskViewClasses");
                    return isAssignableFrom(cls6, setE5);
                }
                return true;
            }
            return false;
        }

        @NotNull
        public final ViewHierarchyNode fromView(@NotNull View view, @Nullable ViewHierarchyNode parent, int distance, @NotNull SentryOptions options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair<Boolean, Rect> pairIsVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean zBooleanValue = pairIsVisibleToUser.component1().booleanValue();
            Rect rectComponent2 = pairIsVisibleToUser.component2();
            boolean z = zBooleanValue && shouldMask(view, options);
            if (view instanceof TextView) {
                if (parent != null) {
                    parent.setImportantForCaptureToAncestors(true);
                }
                TextView textView = (TextView) view;
                Layout layout = textView.getLayout();
                return new TextViewHierarchyNode(layout != null ? new AndroidTextLayout(layout) : null, Integer.valueOf(ViewsKt.toOpaque(textView.getCurrentTextColor())), textView.getTotalPaddingLeft(), ViewsKt.getTotalPaddingTopSafe(textView), textView.getX(), textView.getY(), textView.getWidth(), textView.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + textView.getElevation(), distance, parent, z, true, zBooleanValue, rectComponent2);
            }
            if (!(view instanceof ImageView)) {
                return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + view.getElevation(), distance, parent, z, false, zBooleanValue, rectComponent2);
            }
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            ImageView imageView = (ImageView) view;
            return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (parent != null ? parent.getElevation() : 0.0f), distance, parent, z && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, zBooleanValue, rectComponent2);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", BizTypeConstants.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GenericViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 0;

        public /* synthetic */ GenericViewHierarchyNode(float f, float f2, int i, int i2, float f3, int i3, ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, Rect rect, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, i, i2, f3, i3, (i4 & 64) != 0 ? null : viewHierarchyNode, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? null : rect);
        }

        public GenericViewHierarchyNode(float f, float f2, int i, int i2, float f3, int i3, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, @Nullable Rect rect) {
            super(f, f2, i, i2, f3, i3, viewHierarchyNode, z, z2, z3, rect, null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", BizTypeConstants.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ImageViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 0;

        public /* synthetic */ ImageViewHierarchyNode(float f, float f2, int i, int i2, float f3, int i3, ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, Rect rect, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, i, i2, f3, i3, (i4 & 64) != 0 ? null : viewHierarchyNode, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? null : rect);
        }

        public ImageViewHierarchyNode(float f, float f2, int i, int i2, float f3, int i3, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, @Nullable Rect rect) {
            super(f, f2, i, i2, f3, i3, viewHierarchyNode, z, z2, z3, rect, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "", "lca", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "nodeSubtree", "otherNodeSubtree", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)V", "getLca", "()Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "getNodeSubtree", "setNodeSubtree", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)V", "getOtherNodeSubtree", "setOtherNodeSubtree", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LCAResult {

        @Nullable
        private final ViewHierarchyNode lca;

        @Nullable
        private ViewHierarchyNode nodeSubtree;

        @Nullable
        private ViewHierarchyNode otherNodeSubtree;

        public LCAResult(@Nullable ViewHierarchyNode viewHierarchyNode, @Nullable ViewHierarchyNode viewHierarchyNode2, @Nullable ViewHierarchyNode viewHierarchyNode3) {
            this.lca = viewHierarchyNode;
            this.nodeSubtree = viewHierarchyNode2;
            this.otherNodeSubtree = viewHierarchyNode3;
        }

        public static /* synthetic */ LCAResult copy$default(LCAResult lCAResult, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3, int i, Object obj) {
            if ((i & 1) != 0) {
                viewHierarchyNode = lCAResult.lca;
            }
            if ((i & 2) != 0) {
                viewHierarchyNode2 = lCAResult.nodeSubtree;
            }
            if ((i & 4) != 0) {
                viewHierarchyNode3 = lCAResult.otherNodeSubtree;
            }
            return lCAResult.copy(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        @NotNull
        public final LCAResult copy(@Nullable ViewHierarchyNode lca, @Nullable ViewHierarchyNode nodeSubtree, @Nullable ViewHierarchyNode otherNodeSubtree) {
            return new LCAResult(lca, nodeSubtree, otherNodeSubtree);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LCAResult)) {
                return false;
            }
            LCAResult lCAResult = (LCAResult) other;
            return Intrinsics.areEqual(this.lca, lCAResult.lca) && Intrinsics.areEqual(this.nodeSubtree, lCAResult.nodeSubtree) && Intrinsics.areEqual(this.otherNodeSubtree, lCAResult.otherNodeSubtree);
        }

        @Nullable
        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        @Nullable
        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        @Nullable
        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public int hashCode() {
            ViewHierarchyNode viewHierarchyNode = this.lca;
            int iHashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int iHashCode2 = (iHashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return iHashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
        }

        public final void setNodeSubtree(@Nullable ViewHierarchyNode viewHierarchyNode) {
            this.nodeSubtree = viewHierarchyNode;
        }

        public final void setOtherNodeSubtree(@Nullable ViewHierarchyNode viewHierarchyNode) {
            this.otherNodeSubtree = viewHierarchyNode;
        }

        @NotNull
        public String toString() {
            return "LCAResult(lca=" + this.lca + ", nodeSubtree=" + this.nodeSubtree + ", otherNodeSubtree=" + this.otherNodeSubtree + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "layout", "Lio/sentry/android/replay/util/TextLayout;", "dominantColor", "", "paddingLeft", "paddingTop", "x", "", "y", "width", "height", BizTypeConstants.ELEVATION, "distance", "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(Lio/sentry/android/replay/util/TextLayout;Ljava/lang/Integer;IIFFIIFILio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "getDominantColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLayout", "()Lio/sentry/android/replay/util/TextLayout;", "getPaddingLeft", "()I", "getPaddingTop", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TextViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        @Nullable
        private final Integer dominantColor;

        @Nullable
        private final TextLayout layout;
        private final int paddingLeft;
        private final int paddingTop;

        public /* synthetic */ TextViewHierarchyNode(TextLayout textLayout, Integer num, int i, int i2, float f, float f2, int i3, int i4, float f3, int i5, ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, Rect rect, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? null : textLayout, (i6 & 2) != 0 ? null : num, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, f, f2, i3, i4, f3, i5, (i6 & 1024) != 0 ? null : viewHierarchyNode, (i6 & 2048) != 0 ? false : z, (i6 & 4096) != 0 ? false : z2, (i6 & 8192) != 0 ? false : z3, (i6 & 16384) != 0 ? null : rect);
        }

        @Nullable
        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        @Nullable
        public final TextLayout getLayout() {
            return this.layout;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public TextViewHierarchyNode(@Nullable TextLayout textLayout, @Nullable Integer num, int i, int i2, float f, float f2, int i3, int i4, float f3, int i5, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, @Nullable Rect rect) {
            super(f, f2, i3, i4, f3, i5, viewHierarchyNode, z, z2, z3, rect, null);
            this.layout = textLayout;
            this.dominantColor = num;
            this.paddingLeft = i;
            this.paddingTop = i2;
        }
    }

    public /* synthetic */ ViewHierarchyNode(float f, float f2, int i, int i2, float f3, int i3, ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, f3, i3, viewHierarchyNode, z, z2, z3, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LCAResult findLCA(ViewHierarchyNode node, ViewHierarchyNode otherNode) {
        ViewHierarchyNode viewHierarchyNode = null;
        ViewHierarchyNode viewHierarchyNode2 = Intrinsics.areEqual(this, node) ? this : null;
        ViewHierarchyNode viewHierarchyNode3 = Intrinsics.areEqual(this, otherNode) ? this : null;
        List<? extends ViewHierarchyNode> list = this.children;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            for (ViewHierarchyNode viewHierarchyNode4 : list) {
                LCAResult lCAResultFindLCA = viewHierarchyNode4.findLCA(node, otherNode);
                if (lCAResultFindLCA.getLca() != null) {
                    return lCAResultFindLCA;
                }
                if (lCAResultFindLCA.getNodeSubtree() != null) {
                    viewHierarchyNode2 = viewHierarchyNode4;
                }
                if (lCAResultFindLCA.getOtherNodeSubtree() != null) {
                    viewHierarchyNode3 = viewHierarchyNode4;
                }
            }
        }
        if (viewHierarchyNode2 != null && viewHierarchyNode3 != null) {
            viewHierarchyNode = this;
        }
        return new LCAResult(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
    }

    @Nullable
    public final List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final ViewHierarchyNode getParent() {
        return this.parent;
    }

    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    @Nullable
    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: isImportantForContentCapture, reason: from getter */
    public final boolean getIsImportantForContentCapture() {
        return this.isImportantForContentCapture;
    }

    public final boolean isObscured(@NotNull final ViewHierarchyNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.parent != null) {
            throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.".toString());
        }
        if (node.visibleRect == null) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.isObscured.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke2(@NotNull ViewHierarchyNode otherNode) {
                Intrinsics.checkNotNullParameter(otherNode, "otherNode");
                if (otherNode.getVisibleRect() == null || booleanRef.element) {
                    return Boolean.FALSE;
                }
                if (!otherNode.getIsVisible() || !otherNode.getIsImportantForContentCapture() || !otherNode.getVisibleRect().contains(node.getVisibleRect())) {
                    return Boolean.FALSE;
                }
                if (otherNode.getElevation() > node.getElevation()) {
                    booleanRef.element = true;
                    return Boolean.FALSE;
                }
                if (otherNode.getElevation() == node.getElevation()) {
                    LCAResult lCAResultFindLCA = this.findLCA(node, otherNode);
                    ViewHierarchyNode lca = lCAResultFindLCA.getLca();
                    ViewHierarchyNode nodeSubtree = lCAResultFindLCA.getNodeSubtree();
                    ViewHierarchyNode otherNodeSubtree = lCAResultFindLCA.getOtherNodeSubtree();
                    if (!Intrinsics.areEqual(lca, otherNode) && otherNodeSubtree != null && nodeSubtree != null) {
                        booleanRef.element = otherNodeSubtree.getDistance() > nodeSubtree.getDistance();
                        return Boolean.valueOf(!booleanRef.element);
                    }
                }
                return Boolean.TRUE;
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setChildren(@Nullable List<? extends ViewHierarchyNode> list) {
        this.children = list;
    }

    public final void setImportantForCaptureToAncestors(boolean isImportant) {
        for (ViewHierarchyNode viewHierarchyNode = this.parent; viewHierarchyNode != null; viewHierarchyNode = viewHierarchyNode.parent) {
            viewHierarchyNode.isImportantForContentCapture = isImportant;
        }
    }

    public final void setImportantForContentCapture(boolean z) {
        this.isImportantForContentCapture = z;
    }

    public final void traverse(@NotNull Function1<? super ViewHierarchyNode, Boolean> callback) {
        List<? extends ViewHierarchyNode> list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!callback.invoke2(this).booleanValue() || (list = this.children) == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ViewHierarchyNode) it.next()).traverse(callback);
        }
    }

    private ViewHierarchyNode(float f, float f2, int i, int i2, float f3, int i3, ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, Rect rect) {
        this.x = f;
        this.y = f2;
        this.width = i;
        this.height = i2;
        this.elevation = f3;
        this.distance = i3;
        this.parent = viewHierarchyNode;
        this.shouldMask = z;
        this.isImportantForContentCapture = z2;
        this.isVisible = z3;
        this.visibleRect = rect;
    }

    public /* synthetic */ ViewHierarchyNode(float f, float f2, int i, int i2, float f3, int i3, ViewHierarchyNode viewHierarchyNode, boolean z, boolean z2, boolean z3, Rect rect, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, f3, i3, (i4 & 64) != 0 ? null : viewHierarchyNode, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? null : rect, null);
    }
}
