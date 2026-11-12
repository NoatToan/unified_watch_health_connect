package com.huami.feedback.zepp.ui.edit;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.ContactType;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.feedback.zepp.ui.ImageLoaderKt;
import com.huami.feedback.zepp.ui.R;
import com.huami.lib.compose.rainbow.ColorKt;
import com.huami.lib.compose.rainbow.ShapeKt;
import com.huami.lib.compose.rainbow.TextStyleKt;
import com.huami.lib.compose.rainbow.view.TitleBarKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¡\u0002\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010#\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b%\u0010&\u001a)\u0010)\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010+\u001a\u00020\u0001H\u0003¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010-\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0004\b/\u0010.\u001a\u001f\u00101\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\bH\u0003¢\u0006\u0004\b1\u00102\u001a)\u00104\u001a\u00020\u00012\b\b\u0001\u00103\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0003¢\u0006\u0004\b4\u00105\u001a+\u00107\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0004\b7\u00108\u001a\u0017\u0010:\u001a\u00020\u00012\u0006\u00109\u001a\u00020\bH\u0003¢\u0006\u0004\b:\u0010;\u001a?\u0010>\u001a\u00020\u00012\b\u0010<\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0004\b>\u0010?\u001a?\u0010A\u001a\u00020\u00012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0004\bA\u0010B\u001aI\u0010C\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0004\bC\u0010D\u001a%\u0010G\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00052\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\bG\u0010H\u001aC\u0010N\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00052\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\bN\u0010O\u001a\u0018\u0010R\u001a\u00020\u00012\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0014\u0010T\u001a\u00020\u0003*\u00020S2\u0006\u0010Q\u001a\u00020PH\u0002\u001a\u001a\u0010W\u001a\u00020V2\u0006\u0010U\u001a\u00020SH\u0002ø\u0001\u0000¢\u0006\u0004\bW\u0010X\"\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010Y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lkotlin/Function0;", "", com.alipay.sdk.m.x.d.n, "", "userId", "", "isChineseUser", "isNeedPhone", "", "descriptionLimitSize", "issueTitle", "Lkotlinx/coroutines/flow/StateFlow;", "descriptionStateFlow", "Lcom/huami/feedback/entity/Contact;", ContactSettingItemActivity.KEY_CONTACT, "", "Landroid/net/Uri;", "images", "appLogCheckStateFlow", "deviceLogCheckStateFlow", "deviceLogCheckBoxVisible", "Lkotlin/Function1;", "onDescriptionChanged", "onContactTypeClick", "onImageSelectClick", "onDeleteImage", "onContactChanged", "onAppLogCheck", "onDeviceLogCheck", "onSubmitClick", "FeedbackEditScreen", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZZILjava/lang/String;Lkotlinx/coroutines/flow/StateFlow;Lcom/huami/feedback/entity/Contact;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "text", "Landroidx/compose/ui/Modifier;", "modifier", "r", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "a", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "currentCount", "limitSize", GoogleApiAvailabilityLight.b, "(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", DTransferConstants.SEARCH_KEY, "(Landroidx/compose/runtime/Composer;I)V", "t", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "o", FeedbackActivity.KEY_USER_DESCRIPTION, "u", "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V", "title", "c", "(IIILandroidx/compose/runtime/Composer;I)V", "onValueChanged", SOAP.XMLNS, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "imageCount", "m", "(ILandroidx/compose/runtime/Composer;I)V", "imageUri", "onAddImage", com.loc.z.j, "(Landroid/net/Uri;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectImages", "i", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", GoogleApiAvailabilityLight.a, "(ZZLcom/huami/feedback/entity/Contact;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isChecked", "onClick", "b", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "showDeviceLogCheck", "appLogChecked", "deviceLogChecked", "appLogOnCheck", "deviceLogOnCheck", com.google.android.exoplayer2.text.ttml.b.r, "(ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "v", "Lcom/huami/feedback/ContactType;", "x", "contactType", "Landroidx/compose/ui/text/input/KeyboardType;", "w", "(Lcom/huami/feedback/ContactType;)I", LogUtil.I, "IMAGE_MAX_COUNT", "feedback-zepp-ui_release"}, k = 2, mv = {1, 5, 1})
public final class FeedbackContentScreenKt {
    private static final int a = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContactType.values().length];
            iArr[ContactType.EMAIL.ordinal()] = 1;
            iArr[ContactType.PHONE.ordinal()] = 2;
            iArr[ContactType.WECHAT_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Modifier b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Modifier modifier, int i) {
            super(2);
            this.a = str;
            this.b = modifier;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.a(this.a, this.b, composer, this.c | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, int i) {
            super(2);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.t(this.a, composer, this.b | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, long j) {
            super(2);
            this.a = i;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(this.a, composer, 0), "勾选日志的按钮", (Modifier) null, this.b, composer, 56, 4);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str, int i, int i2) {
            super(2);
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.u(this.a, this.b, composer, this.c | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.a = z;
            this.b = function0;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.b(this.a, this.b, composer, this.c | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, int i2, int i3, int i4) {
            super(2);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.c(this.a, this.b, this.c, composer, this.d | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<KeyboardActionScope, Unit> {
        public final /* synthetic */ FocusManager a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FocusManager focusManager) {
            super(1);
            this.a = focusManager;
        }

        public final void a(@NotNull KeyboardActionScope keyboardActionScope) {
            FocusManager.DefaultImpls.clearFocus$default(this.a, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
            a(keyboardActionScope);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Function1<Contact, Unit> a;
        public final /* synthetic */ Contact b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super Contact, Unit> function1, Contact contact) {
            super(1);
            this.a = function1;
            this.b = contact;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            this.a.invoke(Contact.copy$default(this.b, null, str, 1, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(2);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            TextStyle body4 = TextStyleKt.getBody4();
            TextKt.m869TextfLXpl1I(this.a, null, ColorKt.getS3(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, body4, composer, 0, 64, 32762);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Contact c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function1<Contact, Unit> e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(boolean z, boolean z2, Contact contact, Function0<Unit> function0, Function1<? super Contact, Unit> function1, int i) {
            super(2);
            this.a = z;
            this.b = z2;
            this.c = contact;
            this.d = function0;
            this.e = function1;
            this.f = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.d(this.a, this.b, this.c, this.d, this.e, composer, this.f | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ Function1<String, Unit> f;
        public final /* synthetic */ int g;
        public final /* synthetic */ Function0<Unit> h;
        public final /* synthetic */ Function1<Uri, Unit> i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ Contact l;
        public final /* synthetic */ Function0<Unit> m;
        public final /* synthetic */ Function1<Contact, Unit> n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ Function1<Boolean, Unit> p;
        public final /* synthetic */ State<Boolean> q;
        public final /* synthetic */ Function1<Boolean, Unit> r;
        public final /* synthetic */ State<Boolean> s;
        public final /* synthetic */ Function0<Unit> t;
        public final /* synthetic */ State<String> u;
        public final /* synthetic */ State<List<Uri>> v;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<String, Unit> {
            public final /* synthetic */ int a;
            public final /* synthetic */ Function1<String, Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(int i, Function1<? super String, Unit> function1) {
                super(1);
                this.a = i;
                this.b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                int length = str.length();
                int i = this.a;
                if (length >= i) {
                    str = str.substring(0, i);
                }
                this.b.invoke(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function1<Boolean, Unit> a;
            public final /* synthetic */ State<Boolean> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super Boolean, Unit> function1, State<Boolean> state) {
                super(0);
                this.a = function1;
                this.b = state;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.invoke(Boolean.valueOf(!FeedbackContentScreenKt.f(this.b)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function1<Boolean, Unit> a;
            public final /* synthetic */ State<Boolean> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(Function1<? super Boolean, Unit> function1, State<Boolean> state) {
                super(0);
                this.a = function1;
                this.b = state;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.invoke(Boolean.valueOf(!FeedbackContentScreenKt.g(this.b)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function0<Unit> function0, int i, String str, String str2, int i2, Function1<? super String, Unit> function1, int i3, Function0<Unit> function2, Function1<? super Uri, Unit> function3, boolean z, boolean z2, Contact contact, Function0<Unit> function4, Function1<? super Contact, Unit> function5, boolean z3, Function1<? super Boolean, Unit> function6, State<Boolean> state, Function1<? super Boolean, Unit> function7, State<Boolean> state2, Function0<Unit> function8, State<String> state3, State<? extends List<? extends Uri>> state4) {
            super(2);
            this.a = function0;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = i2;
            this.f = function1;
            this.g = i3;
            this.h = function2;
            this.i = function3;
            this.j = z;
            this.k = z2;
            this.l = contact;
            this.m = function4;
            this.n = function5;
            this.o = z3;
            this.p = function6;
            this.q = state;
            this.r = function7;
            this.s = state2;
            this.t = function8;
            this.u = state3;
            this.v = state4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:55:0x039b  */
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            boolean z;
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Function0<Unit> function0 = this.a;
            int i2 = this.b;
            String str = this.c;
            String str2 = this.d;
            int i3 = this.e;
            Function1<String, Unit> function1 = this.f;
            int i4 = this.g;
            Function0<Unit> function2 = this.h;
            Function1<Uri, Unit> function3 = this.i;
            boolean z2 = this.j;
            boolean z3 = this.k;
            Contact contact = this.l;
            Function0<Unit> function4 = this.m;
            Function1<Contact, Unit> function5 = this.n;
            boolean z4 = this.o;
            Function1<Boolean, Unit> function6 = this.p;
            State<Boolean> state = this.q;
            Function1<Boolean, Unit> function7 = this.r;
            State<Boolean> state2 = this.s;
            Function0<Unit> function8 = this.t;
            State<String> state3 = this.u;
            State<List<Uri>> state4 = this.v;
            composer.startReplaceableGroup(-1113031299);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(276693241);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TitleBarKt.m3381TitleBarmoYUDCk(R.string.feedback_title_new, null, Integer.valueOf(R.drawable.ic_arrow_back_20), 0L, null, null, null, null, 0L, 0L, function0, null, composer, 0, i2 & 14, 3066);
            FeedbackContentScreenKt.q(composer, 0);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            composer.startReplaceableGroup(-1113031299);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierVerticalScroll$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer);
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(276693241);
            FeedbackContentScreenKt.t(str, composer, (i2 >> 3) & 14);
            FeedbackContentScreenKt.o(str2, composer, (i2 >> 15) & 14);
            FeedbackContentScreenKt.u(FeedbackContentScreenKt.h(state3), i3, composer, (i2 >> 9) & 112);
            String strH = FeedbackContentScreenKt.h(state3);
            Object objValueOf = Integer.valueOf(i3);
            int i5 = i4 >> 3;
            composer.startReplaceableGroup(-3686552);
            boolean zChanged = composer.changed(objValueOf) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(i3, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            FeedbackContentScreenKt.s(strH, (Function1) objRememberedValue, composer, 0);
            FeedbackContentScreenKt.m(FeedbackContentScreenKt.e(state4).size(), composer, 0);
            int i6 = i4 >> 9;
            FeedbackContentScreenKt.i(FeedbackContentScreenKt.e(state4), function2, function3, composer, (i6 & 896) | (i6 & 112) | 8);
            float f = 20;
            float f2 = 18;
            FeedbackContentScreenKt.r(StringResources_androidKt.stringResource(z2 ? R.string.feedback_contact_desc_1 : R.string.feedback_contact_desc, composer, 0), PaddingKt.m285paddingqDBjuR0$default(companion, Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(f2), 0.0f, 0.0f, 12, null), composer, 48, 0);
            int i7 = i2 >> 6;
            FeedbackContentScreenKt.d(z3, z2, contact, function4, function5, composer, (i7 & 112) | (i7 & 14) | 512 | (i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & (i4 >> 6)));
            FeedbackContentScreenKt.r(StringResources_androidKt.stringResource(R.string.feedback_log_check_desc, composer, 0), PaddingKt.m285paddingqDBjuR0$default(companion, Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(f2), 0.0f, 0.0f, 12, null), composer, 48, 0);
            boolean zF = FeedbackContentScreenKt.f(state);
            boolean zG = FeedbackContentScreenKt.g(state2);
            composer.startReplaceableGroup(-3686552);
            boolean zChanged2 = composer.changed(function6) | composer.changed(state);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(function6, state);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            Function0 function9 = (Function0) objRememberedValue2;
            composer.startReplaceableGroup(-3686552);
            boolean zChanged3 = composer.changed(function7) | composer.changed(state2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new c(function7, state2);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            FeedbackContentScreenKt.p(z4, zF, zG, function9, (Function0) objRememberedValue3, composer, i5 & 14);
            Modifier modifierM283paddingVpY3zN4$default = PaddingKt.m283paddingVpY3zN4$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m2965constructorimpl(60), 7, null), 0.0f, 1, null), Dp.m2965constructorimpl(44)), Dp.m2965constructorimpl(f), 0.0f, 2, null);
            if ((FeedbackContentScreenKt.h(state3).length() == 0) && FeedbackContentScreenKt.e(state4).isEmpty()) {
                z = false;
            } else {
                if (z2) {
                    if (!(contact.getContactInfo().length() > 0)) {
                        z = false;
                    }
                }
                z = true;
            }
            ButtonKt.Button(function8, modifierM283paddingVpY3zN4$default, z, null, null, null, null, null, null, ComposableSingletons$FeedbackContentScreenKt.INSTANCE.m3333getLambda1$feedback_zepp_ui_release(), composer, ((i4 >> 27) & 14) | 48, 504);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ StateFlow<String> g;
        public final /* synthetic */ Contact h;
        public final /* synthetic */ StateFlow<List<Uri>> i;
        public final /* synthetic */ StateFlow<Boolean> j;
        public final /* synthetic */ StateFlow<Boolean> k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ Function1<String, Unit> m;
        public final /* synthetic */ Function0<Unit> n;
        public final /* synthetic */ Function0<Unit> o;
        public final /* synthetic */ Function1<Uri, Unit> p;
        public final /* synthetic */ Function1<Contact, Unit> q;
        public final /* synthetic */ Function1<Boolean, Unit> r;
        public final /* synthetic */ Function1<Boolean, Unit> s;
        public final /* synthetic */ Function0<Unit> t;
        public final /* synthetic */ int u;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function0<Unit> function0, String str, boolean z, boolean z2, int i, String str2, StateFlow<String> stateFlow, Contact contact, StateFlow<? extends List<? extends Uri>> stateFlow2, StateFlow<Boolean> stateFlow3, StateFlow<Boolean> stateFlow4, boolean z3, Function1<? super String, Unit> function1, Function0<Unit> function2, Function0<Unit> function3, Function1<? super Uri, Unit> function4, Function1<? super Contact, Unit> function5, Function1<? super Boolean, Unit> function6, Function1<? super Boolean, Unit> function7, Function0<Unit> function8, int i2, int i3) {
            super(2);
            this.a = function0;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = i;
            this.f = str2;
            this.g = stateFlow;
            this.h = contact;
            this.i = stateFlow2;
            this.j = stateFlow3;
            this.k = stateFlow4;
            this.l = z3;
            this.m = function1;
            this.n = function2;
            this.o = function3;
            this.p = function4;
            this.q = function5;
            this.r = function6;
            this.s = function7;
            this.t = function8;
            this.u = i2;
            this.v = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.FeedbackEditScreen(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, composer, this.u | 1, this.v);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ List<Uri> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function1<Uri, Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(List<? extends Uri> list, Function0<Unit> function0, Function1<? super Uri, Unit> function1, int i) {
            super(2);
            this.a = list;
            this.b = function0;
            this.c = function1;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.i(this.a, this.b, this.c, composer, this.d | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<Uri, Unit> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        public final void a(@NotNull Uri uri) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            a(uri);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackContentScreenKt$ImageItemView$3$1", f = "FeedbackContentScreen.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ContentResolver b;
        public final /* synthetic */ Uri c;
        public final /* synthetic */ int d;
        public final /* synthetic */ MutableState<Bitmap> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ContentResolver contentResolver, Uri uri, int i, MutableState<Bitmap> mutableState, Continuation<? super n> continuation) {
            super(2, continuation);
            this.b = contentResolver;
            this.c = uri;
            this.d = i;
            this.e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new n(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContentResolver contentResolver = this.b;
                Uri uri = this.c;
                Integer numBoxInt = Boxing.boxInt(this.d);
                this.a = 1;
                obj = ImageLoaderKt.loadImage(contentResolver, uri, numBoxInt, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                FeedbackContentScreenKt.l(this.e, bitmap);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function1<Uri, Unit> a;
        public final /* synthetic */ Uri b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Function1<? super Uri, Unit> function1, Uri uri) {
            super(0);
            this.a = function1;
            this.b = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SoftwareKeyboardController a;
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(SoftwareKeyboardController softwareKeyboardController, Function0<Unit> function0) {
            super(0);
            this.a = softwareKeyboardController;
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SoftwareKeyboardController softwareKeyboardController = this.a;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            this.b.getA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function1<Uri, Unit> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Uri uri, Function0<Unit> function0, Function1<? super Uri, Unit> function1, int i, int i2) {
            super(2);
            this.a = uri;
            this.b = function0;
            this.c = function1;
            this.d = i;
            this.e = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.j(this.a, this.b, this.c, composer, this.d | 1, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(int i, int i2) {
            super(2);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.m(this.a, composer, this.b | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Modifier c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i, int i2, Modifier modifier, int i3, int i4) {
            super(2);
            this.a = i;
            this.b = i2;
            this.c = modifier;
            this.d = i3;
            this.e = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.n(this.a, this.b, this.c, composer, this.d | 1, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, int i) {
            super(2);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.o(this.a, composer, this.b | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function1, int i) {
            super(2);
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = function0;
            this.e = function1;
            this.f = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.p(this.a, this.b, this.c, this.d, this.e, composer, this.f | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i) {
            super(2);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.q(composer, this.a | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Modifier b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, Modifier modifier, int i, int i2) {
            super(2);
            this.a = str;
            this.b = modifier;
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.r(this.a, this.b, composer, this.c | 1, this.d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function1<KeyboardActionScope, Unit> {
        public final /* synthetic */ FocusManager a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(FocusManager focusManager) {
            super(1);
            this.a = focusManager;
        }

        public final void a(@NotNull KeyboardActionScope keyboardActionScope) {
            FocusManager.DefaultImpls.clearFocus$default(this.a, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
            a(keyboardActionScope);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Function1<String, Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(String str, Function1<? super String, Unit> function1, int i) {
            super(2);
            this.a = str;
            this.b = function1;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackContentScreenKt.s(this.a, this.b, composer, this.c | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Context context, String str) {
            super(0);
            this.a = context;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FeedbackContentScreenKt.v(this.a, this.b);
        }
    }

    @Composable
    public static final void FeedbackEditScreen(@NotNull Function0<Unit> function0, @NotNull String str, boolean z2, boolean z3, int i2, @NotNull String str2, @NotNull StateFlow<String> stateFlow, @NotNull Contact contact, @NotNull StateFlow<? extends List<? extends Uri>> stateFlow2, @NotNull StateFlow<Boolean> stateFlow3, @NotNull StateFlow<Boolean> stateFlow4, boolean z4, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function2, @NotNull Function0<Unit> function3, @NotNull Function1<? super Uri, Unit> function4, @NotNull Function1<? super Contact, Unit> function5, @NotNull Function1<? super Boolean, Unit> function6, @NotNull Function1<? super Boolean, Unit> function7, @NotNull Function0<Unit> function8, @Nullable Composer composer, int i3, int i4) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1742985256);
        State stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow2, null, composerStartRestartGroup, 8, 1);
        SurfaceKt.m815SurfaceFjzlyU(BackgroundKt.m111backgroundbw27NRU$default(Modifier.INSTANCE, ColorKt.getS10(), null, 2, null), (Shape) null, 0L, 0L, (BorderStroke) null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new i(function0, i3, str, str2, i2, function1, i4, function3, function4, z3, z2, contact, function2, function5, z4, function6, SnapshotStateKt.collectAsState(stateFlow3, null, composerStartRestartGroup, 8, 1), function7, SnapshotStateKt.collectAsState(stateFlow4, null, composerStartRestartGroup, 8, 1), function8, SnapshotStateKt.collectAsState(stateFlow, null, composerStartRestartGroup, 8, 1), stateCollectAsState)), composerStartRestartGroup, 1572864, 62);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j(function0, str, z2, z3, i2, str2, stateFlow, contact, stateFlow2, stateFlow3, stateFlow4, z4, function1, function2, function3, function4, function5, function6, function7, function8, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void a(String str, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-904512547);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i4 = i3;
        if (((i4 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composer2 = composerStartRestartGroup;
            TextKt.m869TextfLXpl1I(str, modifier, ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composer2, (i4 & 14) | (i4 & 112), 64, 32760);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(str, modifier, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void b(boolean z2, Function0<Unit> function0, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-285874977);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if (((i3 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Pair pair = z2 ? TuplesKt.to(Integer.valueOf(R.drawable.feedback_ic_checked), Color.m1202boximpl(ColorKt.getS20())) : TuplesKt.to(Integer.valueOf(R.drawable.feedback_ic_check), Color.m1202boximpl(ColorKt.getS3()));
            IconButtonKt.IconButton(function0, null, false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819911922, true, new b(((Number) pair.component1()).intValue(), ((Color) pair.component2()).m1222unboximpl())), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 14);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(z2, function0, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void c(@StringRes int i2, int i3, int i4, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-804047505);
        if ((i5 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(i3) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(i4) ? 256 : 128;
        }
        if (((i6 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier.Companion companion = Modifier.INSTANCE;
            float f2 = 20;
            float f3 = 16;
            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m2965constructorimpl(f2), Dp.m2965constructorimpl(f3), Dp.m2965constructorimpl(f2), 0.0f, 8, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            r(StringResources_androidKt.stringResource(i2, composerStartRestartGroup, i6 & 14), RowScopeInstance.INSTANCE.weight(PaddingKt.m285paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m2965constructorimpl(f3), 0.0f, 11, null), 1.0f, false), composerStartRestartGroup, 0, 0);
            int i7 = i6 >> 3;
            n(i3, i4, null, composerStartRestartGroup, (i7 & 14) | (i7 & 112), 4);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(i2, i3, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void d(boolean z2, boolean z3, Contact contact, Function0<Unit> function0, Function1<? super Contact, Unit> function1, Composer composer, int i2) {
        Modifier.Companion companion;
        int i3;
        int i4;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(2068979197);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM110backgroundbw27NRU = BackgroundKt.m110backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion2, Dp.m2965constructorimpl(20), Dp.m2965constructorimpl(12)), 0.0f, 1, null), ColorKt.getS4(), ShapeKt.getShapes().getMedium());
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(-1989997546);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM110backgroundbw27NRU);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-326682743);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (z2) {
            composerStartRestartGroup.startReplaceableGroup(-2127012142);
            TextKt.m869TextfLXpl1I(x(contact.getContactType(), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), PaddingKt.m285paddingqDBjuR0$default(companion2, Dp.m2965constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composerStartRestartGroup, 48, 64, 32760);
            if (z3) {
                composerStartRestartGroup.startReplaceableGroup(-2127011511);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2127011884);
                IconButtonKt.IconButton(function0, null, false, null, ComposableSingletons$FeedbackContentScreenKt.INSTANCE.m3337getLambda5$feedback_zepp_ui_release(), composerStartRestartGroup, (i2 >> 9) & 14, 14);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (z3) {
                composerStartRestartGroup.startReplaceableGroup(-2127011481);
                companion = companion2;
                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, Dp.m2965constructorimpl(8)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                companion = companion2;
                composerStartRestartGroup.startReplaceableGroup(-2127011410);
                composerStartRestartGroup.endReplaceableGroup();
            }
            i4 = 1;
            i3 = 0;
            SpacerKt.Spacer(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m323sizeVpY3zN4(companion, Dp.m2965constructorimpl(1), Dp.m2965constructorimpl(34)), ColorKt.getS3(), null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            companion = companion2;
            i3 = 0;
            i4 = 1;
            composerStartRestartGroup.startReplaceableGroup(-2127011255);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (z2) {
            composerStartRestartGroup.startReplaceableGroup(-2127011212);
            composerStartRestartGroup.endReplaceableGroup();
            strStringResource = "";
        } else {
            composerStartRestartGroup.startReplaceableGroup(-2127011180);
            strStringResource = StringResources_androidKt.stringResource(R.string.feedback_email_hint, composerStartRestartGroup, i3);
            composerStartRestartGroup.endReplaceableGroup();
        }
        String str = strStringResource;
        FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        String contactInfo = contact.getContactInfo();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, i4, null);
        TextStyle body4 = TextStyleKt.getBody4();
        KeyboardOptions keyboardOptionsM422copy3m2b7yw$default = KeyboardOptions.m422copy3m2b7yw$default(KeyboardOptions.INSTANCE.getDefault(), 0, false, w(contact.getContactType()), ImeAction.INSTANCE.m2790getDoneeUduSuo(), 3, null);
        KeyboardActions keyboardActions = new KeyboardActions(new e(focusManager), null, null, null, null, null, 62, null);
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        long s1 = ColorKt.getS1();
        Color.Companion companion4 = Color.INSTANCE;
        TextFieldKt.TextField(contactInfo, (Function1<? super String, Unit>) new f(function1, contact), modifierFillMaxWidth$default, false, false, body4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819911438, true, new g(str)), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptionsM422copy3m2b7yw$default, keyboardActions, true, 0, (MutableInteractionSource) null, (Shape) null, textFieldDefaults.m851textFieldColorsdx8h9Zs(s1, 0L, companion4.m1247getTransparent0d7_KjU(), 0L, 0L, companion4.m1247getTransparent0d7_KjU(), companion4.m1247getTransparent0d7_KjU(), companion4.m1247getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 64, 2096922), composerStartRestartGroup, 12583296, (KeyboardActions.$stable << 9) | 24576, 233304);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(z2, z3, contact, function0, function1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Uri> e(State<? extends List<? extends Uri>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void i(List<? extends Uri> list, Function0<Unit> function0, Function1<? super Uri, Unit> function1, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1656527870);
        Modifier modifierM282paddingVpY3zN4 = PaddingKt.m282paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(20), Dp.m2965constructorimpl(12));
        composerStartRestartGroup.startReplaceableGroup(-1989997546);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM282paddingVpY3zN4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-326682743);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1984650796);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            j((Uri) it2.next(), null, function1, composerStartRestartGroup, (i2 & 896) | 8, 2);
            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(Modifier.INSTANCE, Dp.m2965constructorimpl(8)), composerStartRestartGroup, 6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (list.size() < 4) {
            composerStartRestartGroup.startReplaceableGroup(1984650997);
            j(null, function0, null, composerStartRestartGroup, (i2 & 112) | 6, 4);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1984651076);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new k(list, function0, function1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void j(Uri uri, Function0<Unit> function0, Function1<? super Uri, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super Uri, Unit> function2;
        Function0<Unit> function3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2039194536);
        Function0<Unit> function4 = (i3 & 2) != 0 ? l.a : function0;
        Function1<? super Uri, Unit> function5 = (i3 & 4) != 0 ? m.a : function1;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f2 = 68;
        Modifier modifierM323sizeVpY3zN4 = SizeKt.m323sizeVpY3zN4(companion2, Dp.m2965constructorimpl(f2), Dp.m2965constructorimpl(f2));
        composerStartRestartGroup.startReplaceableGroup(-1990474327);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM323sizeVpY3zN4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (uri != null) {
            composerStartRestartGroup.startReplaceableGroup(841577903);
            float f3 = 64;
            EffectsKt.LaunchedEffect(uri.getPath(), new n(((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getContentResolver(), uri, (int) ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(Dp.m2965constructorimpl(f3)), mutableState, null), composerStartRestartGroup, 0);
            Function1<? super Uri, Unit> function6 = function5;
            function3 = function4;
            ImageKt.Image(AndroidImageBitmap_androidKt.asImageBitmap(k(mutableState)), "选择的图片", ClipKt.clip(PaddingKt.m285paddingqDBjuR0$default(SizeKt.m322size3ABfNKs(companion2, Dp.m2965constructorimpl(f3)), 0.0f, Dp.m2965constructorimpl(4), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(Dp.m2965constructorimpl(6))), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 104);
            float f4 = 44;
            IconButtonKt.IconButton(new o(function6, uri), PaddingKt.m285paddingqDBjuR0$default(boxScopeInstance.matchParentSize(companion2), Dp.m2965constructorimpl(f4), 0.0f, 0.0f, Dp.m2965constructorimpl(f4), 6, null), false, null, ComposableSingletons$FeedbackContentScreenKt.INSTANCE.m3335getLambda3$feedback_zepp_ui_release(), composerStartRestartGroup, 0, 12);
            composerStartRestartGroup.endReplaceableGroup();
            function2 = function6;
            composer2 = composerStartRestartGroup;
        } else {
            function2 = function5;
            function3 = function4;
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(841579228);
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, 8);
            composer2.startReplaceableGroup(-3686552);
            boolean zChanged = composer2.changed(current) | composer2.changed(function3);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new p(current, function3);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) objRememberedValue2, SizeKt.m322size3ABfNKs(companion2, Dp.m2965constructorimpl(64)), false, null, ComposableSingletons$FeedbackContentScreenKt.INSTANCE.m3336getLambda4$feedback_zepp_ui_release(), composer2, 48, 12);
            composer2.endReplaceableGroup();
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new q(uri, function3, function2, i2, i3));
    }

    private static final Bitmap k(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void m(int i2, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1646446431);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((2 ^ (i4 & 11)) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            c(R.string.feedback_issue_image_guide, i2, 4, composerStartRestartGroup, ((i4 << 3) & 112) | 384);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new r(i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final void n(int i2, int i3, Modifier modifier, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        Modifier modifier3;
        long s2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-854195796);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(i3) ? 32 : 16;
        }
        int i7 = i5 & 4;
        if (i7 == 0) {
            if ((i4 & 896) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if (((i6 & 731) ^ 146) == 0 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i2 == i3) {
                    s2 = ColorKt.getP3();
                } else {
                    s2 = ColorKt.getS2();
                }
                long j2 = s2;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('/');
                sb.append(i3);
                TextKt.m869TextfLXpl1I(sb.toString(), modifier3, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composerStartRestartGroup, (i6 >> 3) & 112, 64, 32760);
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new s(i2, i3, modifier4, i4, i5));
        }
        i6 |= 384;
        modifier2 = modifier;
        if (((i6 & 731) ^ 146) == 0) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i2 == i3) {
                s2 = ColorKt.getP3();
            } else {
                s2 = ColorKt.getS2();
            }
            long j3 = s2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i2);
            sb2.append('/');
            sb2.append(i3);
            TextKt.m869TextfLXpl1I(sb2.toString(), modifier3, j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composerStartRestartGroup, (i6 >> 3) & 112, 64, 32760);
            modifier4 = modifier3;
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i2 == i3) {
                s2 = ColorKt.getP3();
            } else {
                s2 = ColorKt.getS2();
            }
            long j4 = s2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i2);
            sb3.append('/');
            sb3.append(i3);
            TextKt.m869TextfLXpl1I(sb3.toString(), modifier3, j4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composerStartRestartGroup, (i6 >> 3) & 112, 64, 32760);
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new s(i2, i3, modifier4, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void o(String str, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1796885671);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 & 11) ^ 2) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            float f2 = 20;
            Modifier modifierM284paddingqDBjuR0 = PaddingKt.m284paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(f2), Dp.m2965constructorimpl(10), Dp.m2965constructorimpl(f2), Dp.m2965constructorimpl(14));
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM284paddingqDBjuR0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m869TextfLXpl1I(StringResources_androidKt.stringResource(R.string.feedback_issue_type_lable, composerStartRestartGroup, 0), null, ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getTitle3(), composerStartRestartGroup, 0, 64, 32762);
            composer2 = composerStartRestartGroup;
            TextKt.m869TextfLXpl1I(str, null, ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody3(), composer2, i3 & 14, 64, 32762);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new t(str, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void p(boolean z2, boolean z3, boolean z4, Function0<Unit> function0, Function0<Unit> function1, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-893688313);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function1) ? 16384 : 8192;
        }
        if (((46811 & i3) ^ 9362) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM282paddingVpY3zN4 = PaddingKt.m282paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m2965constructorimpl(20), Dp.m2965constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM282paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = i3 >> 6;
            b(z3, function0, composerStartRestartGroup, ((i3 >> 3) & 14) | (i4 & 112));
            a(StringResources_androidKt.stringResource(R.string.feedback_log_app_check, composerStartRestartGroup, 0), companion, composerStartRestartGroup, 48);
            if (z2) {
                composerStartRestartGroup.startReplaceableGroup(404397698);
                b(z4, function1, composerStartRestartGroup, ((i3 >> 9) & 112) | (i4 & 14));
                a(StringResources_androidKt.stringResource(R.string.feedback_log_device_check, composerStartRestartGroup, 0), companion, composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(404397942);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new u(z2, z3, z4, function0, function1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void q(Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-433045382);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            SpacerKt.Spacer(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m2965constructorimpl(1)), ColorKt.getS4(), null, 2, null), composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new v(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final void r(String str, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1530699431);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i4;
            if (((i5 & 91) ^ 18) == 0 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m869TextfLXpl1I(str, modifier3, ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getTitle3(), composer2, (i5 & 14) | (i5 & 112), 64, 32760);
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new w(str, modifier2, i2, i3));
        }
        i4 |= 48;
        modifier2 = modifier;
        i5 = i4;
        if (((i5 & 91) ^ 18) == 0) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m869TextfLXpl1I(str, modifier3, ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getTitle3(), composer2, (i5 & 14) | (i5 & 112), 64, 32760);
            modifier2 = modifier3;
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m869TextfLXpl1I(str, modifier3, ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getTitle3(), composer2, (i5 & 14) | (i5 & 112), 64, 32760);
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new w(str, modifier2, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void s(String str, Function1<? super String, Unit> function1, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1460888968);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (((i4 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(Modifier.INSTANCE, Dp.m2965constructorimpl(20), Dp.m2965constructorimpl(12)), 0.0f, 1, null), Dp.m2965constructorimpl(130));
            TextStyle body4 = TextStyleKt.getBody4();
            CornerBasedShape medium = ShapeKt.getShapes().getMedium();
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            long s1 = ColorKt.getS1();
            long s4 = ColorKt.getS4();
            Color.Companion companion = Color.INSTANCE;
            TextFieldColors textFieldColorsM851textFieldColorsdx8h9Zs = textFieldDefaults.m851textFieldColorsdx8h9Zs(s1, 0L, s4, 0L, 0L, companion.m1247getTransparent0d7_KjU(), companion.m1247getTransparent0d7_KjU(), companion.m1247getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 64, 2096922);
            composer2 = composerStartRestartGroup;
            TextFieldKt.TextField(str, function1, modifierM309height3ABfNKs, false, false, body4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FeedbackContentScreenKt.INSTANCE.m3334getLambda2$feedback_zepp_ui_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, KeyboardOptions.m422copy3m2b7yw$default(KeyboardOptions.INSTANCE.getDefault(), 0, false, 0, ImeAction.INSTANCE.m2790getDoneeUduSuo(), 7, null), new KeyboardActions(new x(focusManager), null, null, null, null, null, 62, null), false, 0, (MutableInteractionSource) null, (Shape) medium, textFieldColorsM851textFieldColorsdx8h9Zs, composer2, (i4 & 14) | 384 | (i4 & 112), KeyboardActions.$stable << 9, 118616);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new y(str, function1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void t(String str, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(603034867);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 & 11) ^ 2) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            String strStringResource = StringResources_androidKt.stringResource(R.string.feedback_user_id, new Object[]{str}, composerStartRestartGroup, 64);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m2965constructorimpl(12), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f2 = 4;
            r(strStringResource, PaddingKt.m285paddingqDBjuR0$default(companion, Dp.m2965constructorimpl(20), Dp.m2965constructorimpl(f2), 0.0f, 0.0f, 12, null), composerStartRestartGroup, 48, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.feedback_copy, composerStartRestartGroup, 0), "复制用户ID", PaddingKt.m281padding3ABfNKs(ClickableKt.m129clickableXHw0xAI$default(companion, false, null, null, new z(context, str), 7, null), Dp.m2965constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a0(str, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void u(String str, int i2, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1962183720);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if (((i4 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            c(R.string.feedback_issue_user_desc, str.length(), i2, composerStartRestartGroup, (i4 << 3) & 896);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b0(str, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Context context, String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Object systemService = context.getSystemService("clipboard");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("userId", str));
            objM3845constructorimpl = Result.m3845constructorimpl(context.getString(com.huami.feedback.R.string.feedback_userId_copy_success));
            String string = context.getString(com.huami.feedback.R.string.feedback_userId_copy_fail);
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = string;
            }
            CustomToast.makeText(context, (String) objM3845constructorimpl, 0).show();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    private static final int w(ContactType contactType) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[contactType.ordinal()];
        if (i2 == 1) {
            return KeyboardType.INSTANCE.m2823getEmailPjHm6EE();
        }
        if (i2 == 2) {
            return KeyboardType.INSTANCE.m2827getPhonePjHm6EE();
        }
        if (i2 == 3) {
            return KeyboardType.INSTANCE.m2822getAsciiPjHm6EE();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String x(ContactType contactType, Context context) {
        return context.getResources().getStringArray(R.array.contact_ways)[ArraysKt___ArraysKt.indexOf(ContactType.values(), contactType)];
    }
}
