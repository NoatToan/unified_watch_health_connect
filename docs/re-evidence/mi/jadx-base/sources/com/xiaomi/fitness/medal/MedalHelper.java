package com.xiaomi.fitness.medal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.target.Target;
import com.airbnb.lottie.LottieAnimationView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.IBanner;
import com.google.gson.JsonObject;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.medal.MedalHelper;
import com.xiaomi.fitness.medal.bean.BackgroundPopUp;
import com.xiaomi.fitness.medal.bean.PopMedalList;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.MedalAssistResult;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.preference.MedalPreference;
import com.xiaomi.fitness.medal.preference.PopMedalDataPreference;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.MedalToappRequest;
import com.xiaomi.fitness.medal.request.MedalV2Request;
import com.xiaomi.fitness.medal.share.MedalShareActivity;
import com.xiaomi.fitness.medal.utils.SleepInterfereMedalUtils;
import com.xiaomi.fitness.medal.widget.MedalDialog;
import com.xiaomi.fitness.medal.widget.MedalIconView;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.ecf;
import defpackage.ga9;
import defpackage.h4b;
import defpackage.ha9;
import defpackage.iri;
import defpackage.j0j;
import defpackage.nji;
import defpackage.nuf;
import defpackage.pge;
import defpackage.pui;
import defpackage.tni;
import defpackage.txi;
import defpackage.zr3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 h2\u00020\u0001:\u0001hB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0005H\u0002J\u0018\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u0019H\u0002J\u0010\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u000208H\u0002J*\u00109\u001a\u00020:2\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020:0<J$\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020\u00052\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020:0<H\u0002J\u000e\u0010@\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0005J\u001a\u0010A\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020:0<J\u001c\u0010B\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020:0<H\u0002J5\u0010C\u001a\u00020:2(\u0010D\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F\u0012\u0004\u0012\u00020:0<j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F`E¢\u0006\u0002\u0010HJ&\u0010I\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020G2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020:0NJ\u001e\u0010O\u001a\u00020:2\u0006\u0010P\u001a\u00020\u00052\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020GJ8\u0010Q\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0006\u0010R\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u00192\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010N2\b\b\u0002\u0010U\u001a\u00020\u0019J&\u0010V\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0006\u0010S\u001a\u00020\u00192\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010NJ4\u0010W\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0006\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u00192\f\u0010[\u001a\b\u0012\u0004\u0012\u00020:0NJ\u0016\u0010\\\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0006\u0010?\u001a\u00020\u0005J\u001e\u0010]\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020G0_H\u0002J\u0018\u0010`\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0006\u0010?\u001a\u00020\u0005H\u0002J \u0010a\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0006\u0010b\u001a\u00020c2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0018\u0010d\u001a\u00020:2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u0013H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u0019X\u0086D¢\u0006\n\n\u0002\b\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010)\"\u0004\b0\u0010+¨\u0006i"}, d2 = {"Lcom/xiaomi/fitness/medal/MedalHelper;", "", "<init>", "()V", "MEDAL_ASSIST_SHARE", "", "getMEDAL_ASSIST_SHARE", "()I", "MEDAL_ASSIST_BIRTHDAY", "getMEDAL_ASSIST_BIRTHDAY", "MEDAL_ASSIST_NFC_TRANSIT_CARD", "getMEDAL_ASSIST_NFC_TRANSIT_CARD", "MEDAL_ASSIST_NFC_DOOR_CARD", "getMEDAL_ASSIST_NFC_DOOR_CARD", "MEDAL_ASSIST_ESIM_CARD", "getMEDAL_ASSIST_ESIM_CARD", "MEDAL_ASSIST_FACE_DOWNLOAD", "getMEDAL_ASSIST_FACE_DOWNLOAD", "hasDialog", "", "getHasDialog", "()Z", "setHasDialog", "(Z)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG$1", "dialog", "Lcom/xiaomi/fitness/medal/widget/MedalDialog;", "getDialog", "()Lcom/xiaomi/fitness/medal/widget/MedalDialog;", "setDialog", "(Lcom/xiaomi/fitness/medal/widget/MedalDialog;)V", "lastestDialog", "getLastestDialog", "setLastestDialog", "medalRequest", "Lcom/xiaomi/fitness/medal/request/MedalRequest;", "getMedalRequest", "()Lcom/xiaomi/fitness/medal/request/MedalRequest;", "setMedalRequest", "(Lcom/xiaomi/fitness/medal/request/MedalRequest;)V", "getMedalPlaceHolder", "medalClass", "mMedalRequest", "getMMedalRequest", "setMMedalRequest", "getMedalAssistData", "medalType", "getMedalAssistFaceDownload", "id", "model", "getMedalTurnDoneId", "turnMedalId", "", "doMedalAssistFaceDownload", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/medal/export/data/MedalAssistResult;", "doMedalAssist", "type", "doMedalAssistWithSp", "checkBirthday", "reportMedalAssistBirthDay", "requestAllTypeMedalPopupList", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "(Lkotlin/jvm/functions/Function1;)V", "showLatestMedalDialog", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "latestMedal", "closeDialogCallback", "Lkotlin/Function0;", "showPopupMedalDialogForRunningRoute", "medalResId", "showTrainingPopMedal", "iconRes", "tip", "dismissCallback", "userTip", "showTrainingFinishPopDialog", "showSleepInterfereMedal", "title", CardUIInfo.KEY_SUBTITILE, "btnStr", "clickCallback", "requestMedalList", "showEasterEggMedalDialog", "popMedalList", "", "requestLatestPopUp", "getLatestPopUp", "backgroundPopUp", "Lcom/xiaomi/fitness/medal/bean/BackgroundPopUp;", "trackDialogExposeOrClick", "bean", "Lcom/xiaomi/fitness/medal/bean/BackgroundPopUp$DataList;", "clickType", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMedalHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalHelper.kt\ncom/xiaomi/fitness/medal/MedalHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,1205:1\n37#2:1206\n36#2,3:1207\n54#3,3:1210\n24#3:1213\n59#3,4:1214\n63#3,2:1227\n54#3,3:1229\n24#3:1232\n59#3,4:1233\n63#3,2:1246\n54#3,3:1248\n24#3:1251\n59#3,4:1252\n63#3,2:1265\n54#3,3:1267\n24#3:1270\n59#3,4:1271\n63#3,2:1284\n54#3,3:1286\n24#3:1289\n59#3,4:1290\n63#3,2:1305\n844#4,9:1218\n844#4,9:1237\n844#4,9:1256\n844#4,9:1275\n489#4,11:1294\n*S KotlinDebug\n*F\n+ 1 MedalHelper.kt\ncom/xiaomi/fitness/medal/MedalHelper\n*L\n518#1:1206\n518#1:1207,3\n585#1:1210,3\n585#1:1213\n585#1:1214,4\n585#1:1227,2\n697#1:1229,3\n697#1:1232\n697#1:1233,4\n697#1:1246,2\n785#1:1248,3\n785#1:1251\n785#1:1252,4\n785#1:1265,2\n949#1:1267,3\n949#1:1270\n949#1:1271,4\n949#1:1284,2\n1137#1:1286,3\n1137#1:1289\n1137#1:1290,4\n1137#1:1305,2\n587#1:1218,9\n698#1:1237,9\n787#1:1256,9\n952#1:1275,9\n1138#1:1294,11\n*E\n"})
public final class MedalHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MEDAL_ASSIST_NEW_USER = 7;

    @NotNull
    public static final String MEDAL_ID_CHARMING_NEWCOMER = "PersonalInformation";

    @NotNull
    public static final String MEDAL_ID_FASHION_EXPERT = "DownloadThreeWatch";

    @NotNull
    public static final String MEDAL_ID_FREE_PASSAGE = "AddMenka";

    @NotNull
    public static final String MEDAL_ID_GREEN_COMMUTE = "OpenNFC";

    @NotNull
    public static final String MEDAL_TYPE_PACE = "pace";

    @NotNull
    public static final String TAG = "MedalHelper";

    @Nullable
    private MedalDialog dialog;
    private boolean hasDialog;

    @Nullable
    private MedalDialog lastestDialog;
    public MedalRequest mMedalRequest;
    public MedalRequest medalRequest;
    private final int MEDAL_ASSIST_SHARE = 4;
    private final int MEDAL_ASSIST_BIRTHDAY = 6;
    private final int MEDAL_ASSIST_NFC_TRANSIT_CARD = 8;
    private final int MEDAL_ASSIST_NFC_DOOR_CARD = 9;
    private final int MEDAL_ASSIST_ESIM_CARD = 10;
    private final int MEDAL_ASSIST_FACE_DOWNLOAD = 11;

    /* JADX INFO: renamed from: TAG$1, reason: from kotlin metadata */
    @NotNull
    private final String TAG = TAG;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJB\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b&\u0010%J\u0015\u0010'\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00102\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010.R\u0014\u00103\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00104\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010.R\u0014\u00105\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010.¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/medal/MedalHelper$Companion;", "", "", "gotStatus", "", "got", "Landroid/text/SpannableString;", "getGotStatusSpannableStr", "(Ljava/lang/String;Z)Landroid/text/SpannableString;", "", "medalClass", "", "getMedalImgRatio", "(I)F", "Landroid/content/Context;", "context", "Landroid/view/View;", "zoomView", "Lkotlin/Function1;", "Landroid/app/ActivityOptions;", "Lkotlin/ParameterName;", "name", "activityOptions", "", "intentFunction", "cardZoom", "(Landroid/content/Context;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lecf$a$a;", "medalData", "getMedalProgress", "(Lecf$a$a;)I", "child", "whole", "getOrangeSpannableStr", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;", "data", "constructCurrentProgressDisplayStr", "(Lecf$a$a;)Landroid/text/SpannableString;", "constructsMedalAchievedStatusDisplayStr", "getTypeStrForMedalClass", "(I)Ljava/lang/String;", "value", "unitEnum", "getLocalizedProgressValueWithUnitStr", "(ILjava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "MEDAL_ASSIST_NEW_USER", "I", "MEDAL_ID_CHARMING_NEWCOMER", "MEDAL_ID_FASHION_EXPERT", "MEDAL_ID_FREE_PASSAGE", "MEDAL_ID_GREEN_COMMUTE", "MEDAL_TYPE_PACE", "<init>", "()V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SpannableString getGotStatusSpannableStr(String gotStatus, boolean got) {
            int color = ExtUtilsKt.getColor(nji.m);
            int color2 = ExtUtilsKt.getColor(nji.l);
            if (!got) {
                color = color2;
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
            SpannableString spannableString = new SpannableString(gotStatus);
            spannableString.setSpan(foregroundColorSpan, 0, gotStatus.length(), 17);
            return spannableString;
        }

        public final void cardZoom(@NotNull final Context context, @NotNull final View zoomView, @NotNull final Function1<? super ActivityOptions, Unit> intentFunction) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(zoomView, "zoomView");
            Intrinsics.checkNotNullParameter(intentFunction, "intentFunction");
            new zr3(context, zoomView) { // from class: com.xiaomi.fitness.medal.MedalHelper$Companion$cardZoom$1
                @Override // defpackage.zr3
                public void onCardZoomTriggered(ActivityOptions activityOptions) {
                    intentFunction.invoke2(activityOptions);
                }
            }.setRadius(ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00f5  */
        @NotNull
        public final SpannableString constructCurrentProgressDisplayStr(@NotNull ecf.a.C0923a data) {
            String string;
            Intrinsics.checkNotNullParameter(data, "data");
            String localizedProgressValueWithUnitStr = getLocalizedProgressValueWithUnitStr(data.t, data.v);
            String string2 = "";
            if (!Intrinsics.areEqual(data.m, "pace")) {
                int i = data.f16490b;
                if (i == 6) {
                    if (data.f) {
                        int i2 = data.s;
                        if (i2 == 4) {
                            localizedProgressValueWithUnitStr = data.w + ApplicationExtKt.getApplication().getResources().getQuantityString(txi.common_unit_time, data.w);
                            string2 = ResourceExtKt.getString(j0j.e, localizedProgressValueWithUnitStr);
                        } else if (i2 == 3) {
                            localizedProgressValueWithUnitStr = data.w + ApplicationExtKt.getApplication().getResources().getQuantityString(txi.common_unit_time, data.w);
                            string2 = ResourceExtKt.getString(j0j.j, localizedProgressValueWithUnitStr);
                        } else {
                            localizedProgressValueWithUnitStr = "";
                        }
                    } else {
                        string = ResourceExtKt.getString(j0j.t);
                        localizedProgressValueWithUnitStr = "";
                        string2 = string;
                    }
                } else if (i == 5) {
                    if (data.s == 3) {
                        localizedProgressValueWithUnitStr = data.t + "/" + data.u;
                        string2 = ResourceExtKt.getString(j0j.y, localizedProgressValueWithUnitStr);
                    } else {
                        string2 = ResourceExtKt.getString(j0j.e, localizedProgressValueWithUnitStr);
                    }
                } else if (data.f16491k) {
                    string2 = ResourceExtKt.getString(j0j.e, localizedProgressValueWithUnitStr);
                } else {
                    localizedProgressValueWithUnitStr = "";
                }
            } else if (data.t == 0) {
                string = ResourceExtKt.getString(j0j.t);
                localizedProgressValueWithUnitStr = "";
                string2 = string;
            } else {
                localizedProgressValueWithUnitStr = MedalManagerExtKt.getInstance(MedalManager.INSTANCE).convertSecondsToMinutesStr(data.t);
                string2 = ResourceExtKt.getString(j0j.f22300k, localizedProgressValueWithUnitStr);
            }
            return getOrangeSpannableStr(localizedProgressValueWithUnitStr, string2);
        }

        @NotNull
        public final SpannableString constructsMedalAchievedStatusDisplayStr(@NotNull ecf.a.C0923a medalData) {
            SpannableString gotStatusSpannableStr;
            Intrinsics.checkNotNullParameter(medalData, "medalData");
            int i = medalData.s;
            boolean z = medalData.f;
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(medalData.g);
            SpannableString spannableString = new SpannableString(ResourceExtKt.getString(j0j.s));
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!z) {
                            return getGotStatusSpannableStr(ResourceExtKt.getString(j0j.s), z);
                        }
                        int i2 = medalData.f16490b;
                        if (i2 == 5) {
                            Resources resources = ApplicationExtKt.getApplication().getResources();
                            int i3 = txi.f35162b;
                            int i4 = medalData.w;
                            String quantityString = resources.getQuantityString(i3, i4, Integer.valueOf(i4));
                            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                            return getGotStatusSpannableStr(quantityString + "\n" + ResourceExtKt.getString(j0j.q, dateYYYYMMddLocalFormat), z);
                        }
                        if (i2 != 6) {
                            return spannableString;
                        }
                        Resources resources2 = ApplicationExtKt.getApplication().getResources();
                        int i5 = txi.c;
                        int i6 = medalData.w;
                        String quantityString2 = resources2.getQuantityString(i5, i6, Integer.valueOf(i6));
                        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                        return getGotStatusSpannableStr(quantityString2 + "\n" + ResourceExtKt.getString(j0j.q, dateYYYYMMddLocalFormat), z);
                    }
                    if (i != 4) {
                        return spannableString;
                    }
                }
                gotStatusSpannableStr = !z ? getGotStatusSpannableStr(ResourceExtKt.getString(j0j.s), z) : getGotStatusSpannableStr(ResourceExtKt.getString(j0j.n, dateYYYYMMddLocalFormat), z);
            } else {
                gotStatusSpannableStr = !z ? getGotStatusSpannableStr(ResourceExtKt.getString(j0j.s), z) : getGotStatusSpannableStr(ResourceExtKt.getString(j0j.n, TimeDateUtil.getDateYYYYMMddLocalFormat(medalData.g)), z);
            }
            return gotStatusSpannableStr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final String getLocalizedProgressValueWithUnitStr(int value, @Nullable String unitEnum) {
            if (unitEnum != null) {
                switch (unitEnum.hashCode()) {
                    case -1464834482:
                        if (unitEnum.equals("kilometre")) {
                            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(txi.common_unit_kilometer, value);
                            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                            return value + quantityString;
                        }
                        break;
                    case -678927291:
                        if (unitEnum.equals("percent")) {
                            return ResourceExtKt.getString(j0j.common_progress, Integer.valueOf(value));
                        }
                        break;
                    case 3285891:
                        if (unitEnum.equals("kcal")) {
                            String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(txi.common_unit_calorie, value);
                            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                            return value + quantityString2;
                        }
                        break;
                    case 3540684:
                        if (unitEnum.equals("step")) {
                            String quantityString3 = ApplicationExtKt.getApplication().getResources().getQuantityString(txi.common_unit_step, value);
                            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
                            return value + quantityString3;
                        }
                        break;
                    case 103787791:
                        if (unitEnum.equals("metre")) {
                            String quantityString4 = ApplicationExtKt.getApplication().getResources().getQuantityString(txi.d, value);
                            Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
                            return value + quantityString4;
                        }
                        break;
                    case 110364486:
                        if (unitEnum.equals("times")) {
                            String quantityString5 = ApplicationExtKt.getApplication().getResources().getQuantityString(txi.common_unit_time, value);
                            Intrinsics.checkNotNullExpressionValue(quantityString5, "getQuantityString(...)");
                            return value + quantityString5;
                        }
                        break;
                }
            }
            return String.valueOf(value);
        }

        public final float getMedalImgRatio(int medalClass) {
            if (medalClass != 1) {
                return medalClass != 3 ? 1.0f : 1.03f;
            }
            return 1.25f;
        }

        public final int getMedalProgress(@NotNull ecf.a.C0923a medalData) {
            Intrinsics.checkNotNullParameter(medalData, "medalData");
            boolean z = medalData.f;
            if (z) {
                return 2;
            }
            return (z || medalData.n != 0) ? 1 : 0;
        }

        @NotNull
        public final SpannableString getOrangeSpannableStr(@NotNull String child, @NotNull String whole) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(whole, "whole");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) whole, child, 0, false, 6, (Object) null);
            int length = child.length() + iIndexOf$default;
            SpannableString spannableString = new SpannableString(whole);
            spannableString.setSpan(new ForegroundColorSpan(ExtUtilsKt.getColor(nji.i)), iIndexOf$default, length, 17);
            return spannableString;
        }

        @NotNull
        public final String getTypeStrForMedalClass(int medalClass) {
            switch (medalClass) {
                case 1:
                    return "sports_medal";
                case 2:
                    return "player_medal";
                case 3:
                    return "city_medal";
                case 4:
                    return "activity_medal";
                case 5:
                    return "vibrant_rainbow";
                case 6:
                    return "vitality_competition";
                default:
                    return "";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkBirthday$lambda$7$lambda$6(Function1 success, MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    private final void doMedalAssist(final int type, final Function1<? super MedalAssistResult, Unit> success) {
        getMedalRequest().postClientAssist(getMedalAssistData(type), new Function1() { // from class: aef
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.doMedalAssist$lambda$2(type, success, (MedalAssistResult) obj);
            }
        }, new Function1() { // from class: bef
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.doMedalAssist$lambda$3((ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssist$lambda$2(int i, Function1 success, MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("doMedalAssist succeeded. type = " + i + " medalAssistResult=" + it, new Object[0]);
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssist$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("doMedalAssist failed. error=" + it, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssistFaceDownload$lambda$0(MedalHelper this$0, Function1 success, MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("doMedalAssistFaceDownload succeeded. Assist type = " + this$0.MEDAL_ASSIST_FACE_DOWNLOAD, new Object[0]);
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssistFaceDownload$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("doMedalAssistFaceDownload failed. error=" + it, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssistWithSp$lambda$4(MedalHelper this$0, int i, MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "doMedalAssistWithSp succeeded. type = " + i + " medalAssistResult=" + it);
        if (i == this$0.MEDAL_ASSIST_NFC_DOOR_CARD) {
            MedalPreference.INSTANCE.setKEY_NFC_DOOR_MEDAL_UPLOADED(true);
        } else if (i == this$0.MEDAL_ASSIST_NFC_TRANSIT_CARD) {
            MedalPreference.INSTANCE.setKEY_NFC_TRANSIT_MEDAL_UPLOADED(true);
        } else if (i == 7) {
            MedalPreference.INSTANCE.setKEY_NEW_USER_MEDAL_UPLOADED(true);
        }
        String str = this$0.TAG;
        MedalPreference medalPreference = MedalPreference.INSTANCE;
        Logger.i(str, "KEY_NEW_USER_MEDAL_UPLOADED=" + medalPreference.getKEY_NEW_USER_MEDAL_UPLOADED() + " KEY_NFC_DOOR_MEDAL_UPLOADED=" + medalPreference.getKEY_NFC_DOOR_MEDAL_UPLOADED() + " KEY_NFC_TRANSIT_MEDAL_UPLOADED=" + medalPreference.getKEY_NFC_TRANSIT_MEDAL_UPLOADED());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssistWithSp$lambda$5(MedalHelper this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "postClientAssist failed. ErrorCode=" + it.getErrorCode() + " message=" + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0092 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:4:0x0079, B:8:0x0082, B:10:0x0086, B:12:0x008c, B:14:0x0092, B:16:0x00a6), top: B:21:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x00a6 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:4:0x0079, B:8:0x0082, B:10:0x0086, B:12:0x008c, B:14:0x0092, B:16:0x00a6), top: B:21:0x0079 }] */
    private final void getLatestPopUp(FragmentActivity activity, final BackgroundPopUp backgroundPopUp, int type) {
        MedalDialog medalDialog;
        MedalDialog medalDialog2;
        Dialog dialog;
        final long j = backgroundPopUp.list.get(0).id;
        Dialog dialog2 = null;
        View viewInflate = LayoutInflater.from(activity).inflate(pui.e, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(iri.W);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(iri.m);
        final String str = backgroundPopUp.list.get(0).picture;
        Intrinsics.checkNotNull(imageView);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
        builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.medal.MedalHelper$getLatestPopUp$lambda$45$$inlined$listener$default$1
            @Override // coil.request.ImageRequest.Listener
            public void onCancel(@NotNull ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                Logger.i(this.this$0.getTAG(), "getLatestPopUp load error uri=" + str);
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(@NotNull ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
            }
        });
        imageLoader.enqueue(builderTarget.build());
        MedalDialog.Builder builder = new MedalDialog.Builder();
        Intrinsics.checkNotNull(viewInflate);
        MedalDialog medalDialogCreate = MedalDialog.Builder.setGravity$default(builder.setView(viewInflate), 17, 0, 0, 6, null).create();
        this.lastestDialog = medalDialogCreate;
        if (medalDialogCreate != null) {
            try {
                dialog2 = medalDialogCreate.getDialog();
                if (dialog2 != null || ((medalDialog2 = this.dialog) != null && (dialog = medalDialog2.getDialog()) != null && !dialog.isShowing())) {
                    BackgroundPopUp.DataList dataList = backgroundPopUp.list.get(0);
                    Intrinsics.checkNotNullExpressionValue(dataList, "get(...)");
                    trackDialogExposeOrClick(dataList, false);
                    medalDialog = this.lastestDialog;
                    if (medalDialog != null) {
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        medalDialog.show(supportFragmentManager);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (dialog2 != null) {
            BackgroundPopUp.DataList dataList2 = backgroundPopUp.list.get(0);
            Intrinsics.checkNotNullExpressionValue(dataList2, "get(...)");
            trackDialogExposeOrClick(dataList2, false);
            medalDialog = this.lastestDialog;
            if (medalDialog != null) {
                FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                medalDialog.show(supportFragmentManager2);
            }
        } else {
            BackgroundPopUp.DataList dataList3 = backgroundPopUp.list.get(0);
            Intrinsics.checkNotNullExpressionValue(dataList3, "get(...)");
            trackDialogExposeOrClick(dataList3, false);
            medalDialog = this.lastestDialog;
            if (medalDialog != null) {
                FragmentManager supportFragmentManager3 = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                medalDialog.show(supportFragmentManager3);
            }
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", Long.valueOf(j));
        jsonObject.addProperty("recordCondition", (Number) 0);
        MedalToappRequest medalToappRequest = new MedalToappRequest();
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        medalToappRequest.postPopupStatus(string, new Function1() { // from class: ddf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.getLatestPopUp$lambda$46((BackgroundPopUp) obj);
            }
        }, new Function1() { // from class: odf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.getLatestPopUp$lambda$47((ApiException) obj);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: zdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.getLatestPopUp$lambda$48(this.f41155a, view);
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: eef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.getLatestPopUp$lambda$51(backgroundPopUp, j, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLatestPopUp$lambda$46(BackgroundPopUp it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLatestPopUp$lambda$47(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLatestPopUp$lambda$48(MedalHelper this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MedalDialog medalDialog = this$0.lastestDialog;
        if (medalDialog != null) {
            medalDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLatestPopUp$lambda$51(BackgroundPopUp backgroundPopUp, long j, final MedalHelper this$0, View view) {
        Intrinsics.checkNotNullParameter(backgroundPopUp, "$backgroundPopUp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BackgroundPopUp.DataList dataList = backgroundPopUp.list.get(0);
        IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
        String url = dataList.url;
        Intrinsics.checkNotNullExpressionValue(url, "url");
        instance.onBannerV2Click(url, dataList.urlType, dataList.title, "manual_operation", "popup_" + dataList.id, "popup_" + dataList.id);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", Long.valueOf(j));
        jsonObject.addProperty("recordCondition", (Number) 1);
        BackgroundPopUp.DataList dataList2 = backgroundPopUp.list.get(0);
        Intrinsics.checkNotNullExpressionValue(dataList2, "get(...)");
        this$0.trackDialogExposeOrClick(dataList2, true);
        Logger.INSTANCE.v("goDetail onClick ", new Object[0]);
        MedalToappRequest medalToappRequest = new MedalToappRequest();
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        medalToappRequest.postPopupStatus(string, new Function1() { // from class: cef
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.getLatestPopUp$lambda$51$lambda$49(this.f5247a, (BackgroundPopUp) obj);
            }
        }, new Function1() { // from class: def
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.getLatestPopUp$lambda$51$lambda$50(this.f15442a, (ApiException) obj);
            }
        });
        MedalDialog medalDialog = this$0.lastestDialog;
        if (medalDialog != null) {
            medalDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLatestPopUp$lambda$51$lambda$49(MedalHelper this$0, BackgroundPopUp it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "getLatestPopUp success. backgroundPopUp=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLatestPopUp$lambda$51$lambda$50(MedalHelper this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "getLatestPopUp failed. error=" + it);
        return Unit.INSTANCE;
    }

    private final String getMedalAssistData(int medalType) {
        String strB = h4b.b(MapsKt__MapsJVMKt.mapOf(TuplesKt.to("medalType", Integer.valueOf(medalType))));
        Intrinsics.checkNotNullExpressionValue(strB, "toDataEasyJson(...)");
        return strB;
    }

    private final String getMedalAssistFaceDownload(String id, String model) {
        String strC = h4b.c(new MedalAssistRequest(this.MEDAL_ASSIST_FACE_DOWNLOAD, new MedalAssistFaceDownload(model, id)));
        Intrinsics.checkNotNullExpressionValue(strC, "toJsonString(...)");
        return strC;
    }

    private final String getMedalTurnDoneId(long turnMedalId) {
        String strC = h4b.c(new MedalTurnDone(turnMedalId));
        Intrinsics.checkNotNullExpressionValue(strC, "toJsonString(...)");
        return strC;
    }

    private final void reportMedalAssistBirthDay(final Function1<? super MedalAssistResult, Unit> success) {
        doMedalAssist(this.MEDAL_ASSIST_BIRTHDAY, new Function1() { // from class: tdf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.reportMedalAssistBirthDay$lambda$8(this.f34595a, success, (MedalAssistResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportMedalAssistBirthDay$lambda$8(MedalHelper this$0, Function1 success, MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "reportMedalAssistBirthDay medalAssistResult=" + it);
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAllTypeMedalPopupList$lambda$10(MedalHelper this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "requestAllTypeMedalPopupList failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAllTypeMedalPopupList$lambda$9(MedalHelper this$0, Function1 onSuccess, PopMedalList popMedalList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(popMedalList, "popMedalList");
        if (!popMedalList.getPopMedalList().isEmpty()) {
            Logger.i(this$0.TAG, "requestAllTypeMedalPopupList succeeded. mPopMedalListDataAllType=" + popMedalList.getPopMedalList());
            onSuccess.invoke2(popMedalList.getPopMedalList());
        } else {
            Logger.i(this$0.TAG, "requestAllTypeMedalPopupList succeeded. mPopMedalListDataAllType is Empty");
        }
        return Unit.INSTANCE;
    }

    private final void requestLatestPopUp(final FragmentActivity activity, final int type) {
        String model;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        new MedalToappRequest().getBackgroundPopup(1, String.valueOf(Build.VERSION.SDK_INT), AppUtil.getVersionName(), model, type, new Function1() { // from class: qdf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.requestLatestPopUp$lambda$42(this.f31408a, activity, type, (BackgroundPopUp) obj);
            }
        }, new Function1() { // from class: rdf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.requestLatestPopUp$lambda$43(this.f32439a, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLatestPopUp$lambda$42(MedalHelper this$0, FragmentActivity activity, int i, BackgroundPopUp it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "requestLatestPopUp succeeded. backgroundPopUp=" + it);
        ArrayList<BackgroundPopUp.DataList> list = it.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        if ((!list.isEmpty()) && !this$0.hasDialog) {
            this$0.getLatestPopUp(activity, it, i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLatestPopUp$lambda$43(MedalHelper this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "requestLatestPopUp failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestMedalList$lambda$29(MedalHelper this$0, FragmentActivity activity, int i, PopMedalList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "requestMedalList popMedalList=" + it);
        if (!(!it.getPopMedalList().isEmpty())) {
            this$0.requestLatestPopUp(activity, i);
        } else if (it.getPopMedalList().get(0).getType() == 1) {
            this$0.showEasterEggMedalDialog(activity, CollectionsKt___CollectionsKt.toMutableList((Collection) it.getPopMedalList()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestMedalList$lambda$30(MedalHelper this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "requestMedalList failed. error=" + it + " ");
        return Unit.INSTANCE;
    }

    private final void showEasterEggMedalDialog(final FragmentActivity activity, final List<PopMedalData> popMedalList) {
        MedalDialog medalDialog;
        MedalDialog medalDialog2;
        Dialog dialog;
        Logger.d(this.TAG, "showEasterEggMedalDialog ");
        View viewInflate = LayoutInflater.from(activity).inflate(pui.n, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        final Button button = (Button) viewGroup.findViewById(iri.s);
        Button button2 = (Button) viewGroup.findViewById(iri.s);
        View viewFindViewById = viewGroup.findViewById(iri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        Logger.d(this.TAG, "showEasterEggMedalDialog " + lottieAnimationView);
        View viewFindViewById2 = viewGroup.findViewById(iri.I);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final MedalIconView medalIconView = (MedalIconView) viewFindViewById2;
        medalIconView.setVisibility(0);
        final PopMedalData popMedalData = popMedalList.get(0);
        String icon = TextUtils.isEmpty(popMedalData.getIcon()) ? "-" : popMedalData.getIcon();
        Logger.d(this.TAG, "showEasterEggMedalDialog iconUrl " + icon);
        final String turnIcon = TextUtils.isEmpty(popMedalData.getTurnIcon()) ? "-" : popMedalData.getTurnIcon();
        Logger.d(this.TAG, "showEasterEggMedalDialog turnIconUrl " + turnIcon);
        final int iDip2px = DisplayUtil.dip2px(233.0f);
        final int medalImgRatio = (int) (((float) iDip2px) / INSTANCE.getMedalImgRatio(popMedalData.getMedalClass()));
        final ArrayList arrayList = new ArrayList();
        Logger.d(this.TAG, "showEasterEggMedalDialog " + arrayList);
        medalIconView.getLayoutParams().width = medalImgRatio;
        ImageLoader imageLoader = Coil.imageLoader(medalIconView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(medalIconView.getContext()).data(icon).target(medalIconView);
        builderTarget.size(medalImgRatio, iDip2px);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.medal.MedalHelper$showEasterEggMedalDialog$lambda$36$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                Bitmap bitmap = ((BitmapDrawable) result).getBitmap();
                List list = arrayList;
                Intrinsics.checkNotNull(bitmap);
                list.add(bitmap);
                MedalIconView medalIconView2 = medalIconView;
                ImageLoader imageLoader2 = Coil.imageLoader(medalIconView2.getContext());
                ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(medalIconView2.getContext()).data(turnIcon).target(medalIconView2);
                builderTarget2.size(medalImgRatio, iDip2px);
                final List list2 = arrayList;
                final MedalIconView medalIconView3 = medalIconView;
                final MedalHelper medalHelper = this;
                final LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                builderTarget2.target(new Target() { // from class: com.xiaomi.fitness.medal.MedalHelper$showEasterEggMedalDialog$lambda$36$lambda$35$lambda$34$$inlined$target$default$1
                    @Override // coil.target.Target
                    public void onError(@Nullable Drawable error) {
                    }

                    @Override // coil.target.Target
                    public void onStart(@Nullable Drawable placeholder) {
                    }

                    @Override // coil.target.Target
                    public void onSuccess(@NotNull Drawable result2) {
                        Intrinsics.checkNotNull(result2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        Bitmap bitmap2 = ((BitmapDrawable) result2).getBitmap();
                        List list3 = list2;
                        Intrinsics.checkNotNull(bitmap2);
                        list3.add(bitmap2);
                        MedalIconView medalIconView4 = medalIconView3;
                        List list4 = list2;
                        medalIconView4.setBitmap(list4 != null ? (Bitmap) list4.get(0) : null);
                        Logger.d(medalHelper.getTAG(), "showEasterEggMedalDialog medalIcon.bitmap " + medalIconView3.getBitmap());
                        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(medalIconView3, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.16f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.16f)).setDuration(400L);
                        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
                        duration.setInterpolator(new ha9());
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(medalIconView3, "rotationY", 0.0f, -270.0f).setDuration(500L);
                        Intrinsics.checkNotNullExpressionValue(duration2, "setDuration(...)");
                        duration2.setInterpolator(new ga9());
                        final MedalIconView medalIconView5 = medalIconView3;
                        final List list5 = list2;
                        final MedalHelper medalHelper2 = medalHelper;
                        duration2.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.medal.MedalHelper$showEasterEggMedalDialog$1$2$1$2$1
                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                                MedalIconView medalIconView6 = medalIconView5;
                                List<Bitmap> list6 = list5;
                                medalIconView6.setBitmap(list6 != null ? list6.get(1) : null);
                                Logger.d(medalHelper2.getTAG(), "showEasterEggMedalDialog medalIcon.bitmap " + medalIconView5.getBitmap());
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationRepeat(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                            }
                        });
                        ObjectAnimator duration3 = ObjectAnimator.ofFloat(medalIconView3, "rotationY", -270.0f, -360.0f).setDuration(400L);
                        Intrinsics.checkNotNullExpressionValue(duration3, "setDuration(...)");
                        duration3.setInterpolator(new pge());
                        ObjectAnimator duration4 = ObjectAnimator.ofPropertyValuesHolder(medalIconView3, PropertyValuesHolder.ofFloat("scaleX", 1.16f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.16f, 1.0f)).setDuration(400L);
                        Intrinsics.checkNotNullExpressionValue(duration4, "setDuration(...)");
                        duration4.setInterpolator(new ha9());
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(duration, duration2, duration3, duration4);
                        animatorSet.setStartDelay(200L);
                        animatorSet.start();
                        final LottieAnimationView lottieAnimationView3 = lottieAnimationView2;
                        lottieAnimationView3.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.medal.MedalHelper$showEasterEggMedalDialog$1$2$1$2$2
                            @Override // java.lang.Runnable
                            public final void run() {
                                lottieAnimationView3.setVisibility(0);
                                lottieAnimationView3.w();
                            }
                        }, 200L);
                        LottieAnimationView lottieAnimationView4 = lottieAnimationView2;
                        final LottieAnimationView lottieAnimationView5 = lottieAnimationView2;
                        lottieAnimationView4.i(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.medal.MedalHelper$showEasterEggMedalDialog$1$2$1$2$3
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                                lottieAnimationView5.setVisibility(4);
                            }
                        });
                    }
                });
                imageLoader2.enqueue(builderTarget2.build());
            }
        });
        imageLoader.enqueue(builderTarget.build());
        TextView textView = (TextView) viewGroup.findViewById(iri.H);
        ImageView imageView = (ImageView) viewGroup.findViewById(iri.m);
        textView.setText(popMedalData.getTurnDesc());
        Logger.d(this.TAG, "showEasterEggMedalDialog " + ((Object) textView.getText()));
        if (this.dialog == null) {
            this.dialog = new MedalDialog.Builder().setView(viewGroup).setCanceledOnTouchOutside(true).setOnViewClick(new Function2() { // from class: fef
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MedalHelper.showEasterEggMedalDialog$lambda$37(this.f17704a, (View) obj, (MedalDialog) obj2);
                }
            }).create();
        }
        MedalDialog medalDialog3 = this.dialog;
        if (((medalDialog3 != null ? medalDialog3.getDialog() : null) == null || ((medalDialog2 = this.dialog) != null && (dialog = medalDialog2.getDialog()) != null && !dialog.isShowing())) && (medalDialog = this.dialog) != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            medalDialog.show(supportFragmentManager);
        }
        this.hasDialog = true;
        MedalRequest.turnMedalDone$default(getMedalRequest(), getMedalTurnDoneId(popMedalData.getId()), new Function1() { // from class: gef
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.showEasterEggMedalDialog$lambda$39(button, popMedalData, activity, this, (PopMedalList) obj);
            }
        }, null, 4, null);
        button2.setVisibility(0);
        button2.setOnClickListener(new View.OnClickListener() { // from class: hef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showEasterEggMedalDialog$lambda$40(this.f19976a, popMedalData, activity, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ief
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showEasterEggMedalDialog$lambda$41(this.f21054a, popMedalList, activity, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showEasterEggMedalDialog$lambda$37(MedalHelper this$0, View contentView, MedalDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (contentView.getId() == iri.m) {
            dialog.dismiss();
        } else {
            String str = this$0.TAG;
        }
        dialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showEasterEggMedalDialog$lambda$39(Button button, final PopMedalData popMedalData, final FragmentActivity activity, final MedalHelper this$0, PopMedalList it) {
        Intrinsics.checkNotNullParameter(popMedalData, "$popMedalData");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        button.setVisibility(0);
        button.setOnClickListener(new View.OnClickListener() { // from class: xdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showEasterEggMedalDialog$lambda$39$lambda$38(popMedalData, activity, this$0, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEasterEggMedalDialog$lambda$39$lambda$38(PopMedalData popMedalData, FragmentActivity activity, MedalHelper this$0, View view) {
        Intrinsics.checkNotNullParameter(popMedalData, "$popMedalData");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra("key_params_medal_id", popMedalData.getTurnId());
        intent.putExtra("key_params_medal_type", popMedalData.getMedalType());
        intent.setClass(activity, MedalDetailActivity.class);
        activity.startActivity(intent);
        MedalDialog medalDialog = this$0.dialog;
        if (medalDialog != null) {
            medalDialog.dismiss();
        }
        this$0.dialog = null;
        this$0.hasDialog = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEasterEggMedalDialog$lambda$40(MedalHelper this$0, PopMedalData popMedalData, FragmentActivity activity, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(popMedalData, "$popMedalData");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        PopMedalDataPreference popMedalDataPreference = PopMedalDataPreference.INSTANCE;
        popMedalDataPreference.setPOP_MEDAL_DIALOG_IS_SHOWING(false);
        popMedalDataPreference.setCOME_FROM_MEDAL_DETAIL_PAGE(true);
        MedalDialog medalDialog = this$0.dialog;
        if (medalDialog != null) {
            medalDialog.dismiss();
        }
        Intent intent = new Intent();
        MedalShareActivity.Companion companion = MedalShareActivity.INSTANCE;
        String name = popMedalData.getName();
        String detailName = popMedalData.getDetailName();
        if (detailName == null) {
            detailName = "";
        }
        intent.putExtra(MedalShareActivity.KEY_SHARE_BUNDLE_TYPE, companion.getMedalShareBundle(name, detailName, popMedalData.getIcon(), popMedalData.getGotTime(), popMedalData.getMedalClass(), popMedalData.getId()));
        intent.setClass(activity, MedalShareActivity.class);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEasterEggMedalDialog$lambda$41(MedalHelper this$0, List popMedalList, FragmentActivity activity, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(popMedalList, "$popMedalList");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        MedalDialog medalDialog = this$0.dialog;
        if (medalDialog != null) {
            medalDialog.dismiss();
        }
        this$0.dialog = null;
        this$0.hasDialog = false;
        popMedalList.remove(0);
        if (popMedalList.size() <= 0 || ((PopMedalData) popMedalList.get(0)).getType() != 1) {
            return;
        }
        this$0.showEasterEggMedalDialog(activity, popMedalList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showLatestMedalDialog$default(MedalHelper medalHelper, FragmentActivity fragmentActivity, PopMedalData popMedalData, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: sdf
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        medalHelper.showLatestMedalDialog(fragmentActivity, popMedalData, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLatestMedalDialog$lambda$15(MedalDialog medalDialog, PopMedalData latestMedal, FragmentActivity activity, View view) {
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        Intrinsics.checkNotNullParameter(latestMedal, "$latestMedal");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        PopMedalDataPreference popMedalDataPreference = PopMedalDataPreference.INSTANCE;
        popMedalDataPreference.setPOP_MEDAL_DIALOG_IS_SHOWING(false);
        popMedalDataPreference.setCOME_FROM_MEDAL_DETAIL_PAGE(true);
        medalDialog.dismiss();
        Intent intent = new Intent();
        intent.putExtra("key_params_medal_id", latestMedal.getId());
        intent.putExtra("key_params_medal_type", latestMedal.getMedalType());
        intent.putExtra("key_params_medal_class", latestMedal.getMedalClass());
        intent.putExtra("key_from_medal_home", false);
        intent.setClass(activity, MedalDetailActivity.class);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLatestMedalDialog$lambda$16(MedalDialog medalDialog, PopMedalData latestMedal, FragmentActivity activity, View view) {
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        Intrinsics.checkNotNullParameter(latestMedal, "$latestMedal");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        PopMedalDataPreference popMedalDataPreference = PopMedalDataPreference.INSTANCE;
        popMedalDataPreference.setPOP_MEDAL_DIALOG_IS_SHOWING(false);
        popMedalDataPreference.setCOME_FROM_MEDAL_DETAIL_PAGE(true);
        medalDialog.dismiss();
        Intent intent = new Intent();
        MedalShareActivity.Companion companion = MedalShareActivity.INSTANCE;
        String name = latestMedal.getName();
        String detailName = latestMedal.getDetailName();
        if (detailName == null) {
            detailName = "";
        }
        intent.putExtra(MedalShareActivity.KEY_SHARE_BUNDLE_TYPE, companion.getMedalShareBundle(name, detailName, latestMedal.getIcon(), latestMedal.getGotTime(), latestMedal.getMedalClass(), latestMedal.getId()));
        intent.setClass(activity, MedalShareActivity.class);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLatestMedalDialog$lambda$17(Function0 closeDialogCallback, MedalDialog medalDialog, View view) {
        Intrinsics.checkNotNullParameter(closeDialogCallback, "$closeDialogCallback");
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        PopMedalDataPreference popMedalDataPreference = PopMedalDataPreference.INSTANCE;
        popMedalDataPreference.setPOP_MEDAL_DIALOG_IS_SHOWING(false);
        popMedalDataPreference.setCOME_FROM_MEDAL_DETAIL_PAGE(false);
        closeDialogCallback.invoke();
        medalDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopupMedalDialogForRunningRoute$lambda$21(MedalDialog medalDialog, Button button) {
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        medalDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupMedalDialogForRunningRoute$lambda$22(MedalDialog medalDialog, View view) {
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        medalDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTrainingFinishPopDialog$lambda$27(LottieAnimationView caidaiLottie) {
        Intrinsics.checkNotNullParameter(caidaiLottie, "$caidaiLottie");
        caidaiLottie.setVisibility(0);
        caidaiLottie.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTrainingFinishPopDialog$lambda$28(MedalDialog medalDialog, View view) {
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        medalDialog.dismiss();
    }

    public static /* synthetic */ void showTrainingPopMedal$default(MedalHelper medalHelper, FragmentActivity fragmentActivity, int i, String str, Function0 function0, String str2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str2 = "";
        }
        medalHelper.showTrainingPopMedal(fragmentActivity, i, str, function0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTrainingPopMedal$lambda$26(MedalDialog medalDialog, View view) {
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        medalDialog.dismiss();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    private final void trackDialogExposeOrClick(BackgroundPopUp.DataList bean, boolean clickType) {
        String str;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        String autoPageTrackCurrentFragmentName = oneTrackExtKt.getAutoPageTrackCurrentFragmentName();
        Logger.i(this.TAG, "trackDialogExposeOrClick " + autoPageTrackCurrentFragmentName);
        String str2 = clickType ? "click_v3" : "expose_v3";
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("tip", clickType ? "56.71.1.1.29823" : "56.71.1.1.29821");
        pairArr[1] = TuplesKt.to("name", "overall_pop");
        pairArr[2] = TuplesKt.to("picture_name", bean.title);
        pairArr[3] = TuplesKt.to("picture_id", Long.valueOf(bean.id));
        pairArr[4] = TuplesKt.to("url", bean.url);
        if (autoPageTrackCurrentFragmentName != null) {
            switch (autoPageTrackCurrentFragmentName) {
                case "com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragment":
                    str = "device_tab_page";
                    break;
                case "com.xiaomi.fitness.watch.face.market.DeviceFaceMarketFragment":
                    str = "watchface_page";
                    break;
                case "com.xiaomi.fitness.mine.MineFragment":
                    str = "profile_tab_page";
                    break;
                case "com.xiaomi.fitness.sport.sporttab.SportTabV4Fragment":
                    str = "workout_tab_page";
                    break;
                case "com.xiaomi.fitness.watch.face.FaceMeFragment":
                case "com.xiaomi.fitness.watch.face.FaceFragment":
                    str = "watchface_page";
                    break;
                default:
                    str = "status_tab_page";
                    break;
            }
        } else {
            str = "status_tab_page";
        }
        pairArr[5] = TuplesKt.to("source", str);
        oneTrackExtKt.reportData(str2, MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void checkBirthday(@NotNull final Function1<? super MedalAssistResult, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        String birth = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getBirth();
        if (birth != null) {
            String[] strArr = (String[]) new Regex("-").split(birth, 0).toArray(new String[0]);
            if (strArr.length == 3) {
                int i = Integer.parseInt(strArr[0]);
                int i2 = Integer.parseInt(strArr[1]);
                int i3 = Integer.parseInt(strArr[2]);
                Calendar calendar = Calendar.getInstance();
                int i4 = calendar.get(1);
                int i5 = calendar.get(2) + 1;
                int i6 = calendar.get(5);
                if (i4 >= i && i5 == i2 && i6 == i3) {
                    reportMedalAssistBirthDay(new Function1() { // from class: ydf
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return MedalHelper.checkBirthday$lambda$7$lambda$6(success, (MedalAssistResult) obj);
                        }
                    });
                }
            }
        }
    }

    public final void doMedalAssistFaceDownload(@NotNull String id, @NotNull String model, @NotNull final Function1<? super MedalAssistResult, Unit> success) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        getMedalRequest().postClientAssist(getMedalAssistFaceDownload(id, model), new Function1() { // from class: vdf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.doMedalAssistFaceDownload$lambda$0(this.f36771a, success, (MedalAssistResult) obj);
            }
        }, new Function1() { // from class: wdf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.doMedalAssistFaceDownload$lambda$1((ApiException) obj);
            }
        });
    }

    public final void doMedalAssistWithSp(final int type) {
        Logger.d(this.TAG, "doMedalAssistWithSp type=" + type);
        if (TextUtils.isEmpty(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId())) {
            return;
        }
        boolean z = true;
        if (type != this.MEDAL_ASSIST_NFC_DOOR_CARD ? type != this.MEDAL_ASSIST_NFC_TRANSIT_CARD ? type != 7 || MedalPreference.INSTANCE.getKEY_NEW_USER_MEDAL_UPLOADED() : MedalPreference.INSTANCE.getKEY_NFC_DOOR_MEDAL_UPLOADED() : MedalPreference.INSTANCE.getKEY_NFC_DOOR_MEDAL_UPLOADED()) {
            z = false;
        }
        Logger.d(this.TAG, "doMedalAssistWithSp needUpload=" + z);
        if (z) {
            getMedalRequest().postClientAssist(getMedalAssistData(type), new Function1() { // from class: ndf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalHelper.doMedalAssistWithSp$lambda$4(this.f27811a, type, (MedalAssistResult) obj);
                }
            }, new Function1() { // from class: pdf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalHelper.doMedalAssistWithSp$lambda$5(this.f30291a, (ApiException) obj);
                }
            });
        }
    }

    @Nullable
    public final MedalDialog getDialog() {
        return this.dialog;
    }

    public final boolean getHasDialog() {
        return this.hasDialog;
    }

    @Nullable
    public final MedalDialog getLastestDialog() {
        return this.lastestDialog;
    }

    public final int getMEDAL_ASSIST_BIRTHDAY() {
        return this.MEDAL_ASSIST_BIRTHDAY;
    }

    public final int getMEDAL_ASSIST_ESIM_CARD() {
        return this.MEDAL_ASSIST_ESIM_CARD;
    }

    public final int getMEDAL_ASSIST_FACE_DOWNLOAD() {
        return this.MEDAL_ASSIST_FACE_DOWNLOAD;
    }

    public final int getMEDAL_ASSIST_NFC_DOOR_CARD() {
        return this.MEDAL_ASSIST_NFC_DOOR_CARD;
    }

    public final int getMEDAL_ASSIST_NFC_TRANSIT_CARD() {
        return this.MEDAL_ASSIST_NFC_TRANSIT_CARD;
    }

    public final int getMEDAL_ASSIST_SHARE() {
        return this.MEDAL_ASSIST_SHARE;
    }

    @NotNull
    public final MedalRequest getMMedalRequest() {
        MedalRequest medalRequest = this.mMedalRequest;
        if (medalRequest != null) {
            return medalRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMedalRequest");
        return null;
    }

    public final int getMedalPlaceHolder(int medalClass) {
        if (medalClass == 1) {
            return tni.h;
        }
        if (medalClass != 2) {
            return medalClass != 3 ? tni.e : tni.f;
        }
        return tni.g;
    }

    @NotNull
    public final MedalRequest getMedalRequest() {
        MedalRequest medalRequest = this.medalRequest;
        if (medalRequest != null) {
            return medalRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalRequest");
        return null;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final void requestAllTypeMedalPopupList(@NotNull final Function1<? super List<PopMedalData>, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        new MedalV2Request().getMedalList(new Function1() { // from class: jef
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.requestAllTypeMedalPopupList$lambda$9(this.f22702a, onSuccess, (PopMedalList) obj);
            }
        }, new Function1() { // from class: kef
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.requestAllTypeMedalPopupList$lambda$10(this.f23774a, (ApiException) obj);
            }
        });
    }

    public final void requestMedalList(@NotNull final FragmentActivity activity, final int type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        new MedalV2Request().getMedalList(new Function1() { // from class: ldf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.requestMedalList$lambda$29(this.f24937a, activity, type, (PopMedalList) obj);
            }
        }, new Function1() { // from class: mdf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.requestMedalList$lambda$30(this.f26037a, (ApiException) obj);
            }
        });
    }

    public final void setDialog(@Nullable MedalDialog medalDialog) {
        this.dialog = medalDialog;
    }

    public final void setHasDialog(boolean z) {
        this.hasDialog = z;
    }

    public final void setLastestDialog(@Nullable MedalDialog medalDialog) {
        this.lastestDialog = medalDialog;
    }

    public final void setMMedalRequest(@NotNull MedalRequest medalRequest) {
        Intrinsics.checkNotNullParameter(medalRequest, "<set-?>");
        this.mMedalRequest = medalRequest;
    }

    public final void setMedalRequest(@NotNull MedalRequest medalRequest) {
        Intrinsics.checkNotNullParameter(medalRequest, "<set-?>");
        this.medalRequest = medalRequest;
    }

    public final void showLatestMedalDialog(@NotNull final FragmentActivity activity, @NotNull final PopMedalData latestMedal, @NotNull final Function0<Unit> closeDialogCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(latestMedal, "latestMedal");
        Intrinsics.checkNotNullParameter(closeDialogCallback, "closeDialogCallback");
        PopMedalDataPreference popMedalDataPreference = PopMedalDataPreference.INSTANCE;
        boolean pop_medal_dialog_is_showing = popMedalDataPreference.getPOP_MEDAL_DIALOG_IS_SHOWING();
        Logger.d(this.TAG, "showLatestMedalDialog POP_MEDAL_DIALOG_IS_SHOWING=" + pop_medal_dialog_is_showing);
        if (pop_medal_dialog_is_showing) {
            return;
        }
        View viewInflate = LayoutInflater.from(activity).inflate(pui.n, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        Button button = (Button) viewGroup.findViewById(iri.f);
        Button button2 = (Button) viewGroup.findViewById(iri.s);
        View viewFindViewById = viewGroup.findViewById(iri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(iri.I);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final MedalIconView medalIconView = (MedalIconView) viewFindViewById2;
        final String icon = TextUtils.isEmpty(latestMedal.getIcon()) ? "-" : latestMedal.getIcon();
        Logger.d(this.TAG, "iconUrl IS " + icon);
        int dp = ExtUtilsKt.getDp(Integer.valueOf(SportReportBaseParser.ReportType.avgDivingDepth));
        int medalListImgRatio = (int) (((float) dp) * MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getMedalListImgRatio(latestMedal.getMedalClass()));
        ImageLoader imageLoader = Coil.imageLoader(medalIconView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(medalIconView.getContext()).data(icon).target(medalIconView);
        builderTarget.size(dp, medalListImgRatio);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.medal.MedalHelper$showLatestMedalDialog$lambda$14$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                Bitmap bitmap = ((BitmapDrawable) result).getBitmap();
                Logger.d(this.this$0.getTAG(), "iconUrl IS " + icon);
                medalIconView.setBitmap(bitmap);
                Logger.d(this.this$0.getTAG(), "medalIcon.bitmap IS " + bitmap);
                MedalIconView medalIconView2 = medalIconView;
                Property property = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(medalIconView2, (Property<MedalIconView, Float>) property, 0.0f, 0.8f);
                MedalIconView medalIconView3 = medalIconView;
                Property property2 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(medalIconView3, (Property<MedalIconView, Float>) property2, 0.0f, 0.8f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                animatorSet.setInterpolator(new ha9());
                animatorSet.setDuration(450L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(medalIconView, (Property<MedalIconView, Float>) property, 0.8f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(medalIconView, (Property<MedalIconView, Float>) property2, 0.8f, 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
                animatorSet2.setInterpolator(new ha9());
                MedalIconView medalIconView4 = medalIconView;
                medalIconView4.setPivotX(medalIconView4.getMeasuredWidth() / 2);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(medalIconView, "rotateY", 0.0f, 370.0f);
                objectAnimatorOfFloat5.setInterpolator(new ha9());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(animatorSet2).with(objectAnimatorOfFloat5);
                animatorSet3.setDuration(850L);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(medalIconView, "rotateY", 370.0f, 360.0f);
                objectAnimatorOfFloat6.setInterpolator(new ha9());
                objectAnimatorOfFloat6.setDuration(550L);
                final AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playSequentially(animatorSet, animatorSet3, objectAnimatorOfFloat6);
                final MedalIconView medalIconView5 = medalIconView;
                medalIconView5.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.medal.MedalHelper$showLatestMedalDialog$2$2$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Logger.d("BitmapLoaded startAnimator", new Object[0]);
                        medalIconView5.setVisibility(0);
                        animatorSet4.start();
                    }
                }, 250L);
                final LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                lottieAnimationView2.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.medal.MedalHelper$showLatestMedalDialog$2$2$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lottieAnimationView2.setVisibility(0);
                        lottieAnimationView2.w();
                    }
                }, 200L);
                LottieAnimationView lottieAnimationView3 = lottieAnimationView;
                final LottieAnimationView lottieAnimationView4 = lottieAnimationView;
                lottieAnimationView3.i(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.medal.MedalHelper$showLatestMedalDialog$2$2$3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        lottieAnimationView4.setVisibility(4);
                    }
                });
            }
        });
        imageLoader.enqueue(builderTarget.build());
        TextView textView = (TextView) viewGroup.findViewById(iri.H);
        ImageView imageView = (ImageView) viewGroup.findViewById(iri.m);
        textView.setText(activity.getResources().getString(j0j.p, latestMedal.getName()));
        Logger.d(this.TAG, "medalGot.text IS " + ((Object) textView.getText()));
        final MedalDialog medalDialogCreate = new MedalDialog.Builder().setView(viewGroup).create();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        medalDialogCreate.show(supportFragmentManager);
        popMedalDataPreference.setPOP_MEDAL_DIALOG_IS_SHOWING(true);
        Logger.d(this.TAG, "medalGot.text IS " + ((Object) textView.getText()));
        button.setVisibility(0);
        button.setOnClickListener(new View.OnClickListener() { // from class: idf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showLatestMedalDialog$lambda$15(medalDialogCreate, latestMedal, activity, view);
            }
        });
        button2.setVisibility(0);
        button2.setOnClickListener(new View.OnClickListener() { // from class: jdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showLatestMedalDialog$lambda$16(medalDialogCreate, latestMedal, activity, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: kdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showLatestMedalDialog$lambda$17(closeDialogCallback, medalDialogCreate, view);
            }
        });
        Logger.d("latest medal id: " + latestMedal.getId(), new Object[0]);
        this.hasDialog = true;
    }

    public final void showPopupMedalDialogForRunningRoute(int medalResId, @NotNull FragmentActivity activity, @NotNull PopMedalData latestMedal) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(latestMedal, "latestMedal");
        View viewInflate = LayoutInflater.from(activity).inflate(pui.o, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        View viewFindViewById = viewGroup.findViewById(iri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(iri.I);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final MedalIconView medalIconView = (MedalIconView) viewFindViewById2;
        Integer numValueOf = Integer.valueOf(medalResId);
        ImageLoader imageLoader = Coil.imageLoader(medalIconView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(medalIconView.getContext()).data(numValueOf).target(medalIconView);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.medal.MedalHelper$showPopupMedalDialogForRunningRoute$lambda$20$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                medalIconView.setBitmap(((BitmapDrawable) result).getBitmap());
                MedalIconView medalIconView2 = medalIconView;
                Property property = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(medalIconView2, (Property<MedalIconView, Float>) property, 0.0f, 0.8f);
                MedalIconView medalIconView3 = medalIconView;
                Property property2 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(medalIconView3, (Property<MedalIconView, Float>) property2, 0.0f, 0.8f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                animatorSet.setInterpolator(new ha9());
                animatorSet.setDuration(450L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(medalIconView, (Property<MedalIconView, Float>) property, 0.8f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(medalIconView, (Property<MedalIconView, Float>) property2, 0.8f, 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
                animatorSet2.setInterpolator(new ha9());
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(medalIconView, "rotateY", 0.0f, 370.0f);
                objectAnimatorOfFloat5.setInterpolator(new ha9());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(animatorSet2).with(objectAnimatorOfFloat5);
                animatorSet3.setDuration(850L);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(medalIconView, "rotateY", 370.0f, 360.0f);
                objectAnimatorOfFloat6.setInterpolator(new ha9());
                objectAnimatorOfFloat6.setDuration(550L);
                final AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playSequentially(animatorSet, animatorSet3, objectAnimatorOfFloat6);
                final MedalIconView medalIconView4 = medalIconView;
                final MedalHelper medalHelper = this;
                medalIconView4.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.medal.MedalHelper$showPopupMedalDialogForRunningRoute$1$2$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Logger.d("BitmapLoaded startAnimator", new Object[0]);
                        medalIconView4.setVisibility(0);
                        MedalIconView medalIconView5 = medalIconView4;
                        medalIconView5.setPivotX((medalIconView5.getWidth() / 2.0f) + ExtUtilsKt.getDp(30));
                        MedalIconView medalIconView6 = medalIconView4;
                        medalIconView6.setPivotY(medalIconView6.getHeight() / 2.0f);
                        Logger.d(medalHelper.getTAG(), "medalIcon.pivotX=" + medalIconView4.getPivotX() + " medalIcon.pivotY=" + medalIconView4.getPivotY());
                        animatorSet4.start();
                    }
                }, 250L);
                final LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                lottieAnimationView2.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.medal.MedalHelper$showPopupMedalDialogForRunningRoute$1$2$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lottieAnimationView2.setVisibility(0);
                        lottieAnimationView2.w();
                    }
                }, 200L);
                LottieAnimationView lottieAnimationView3 = lottieAnimationView;
                final LottieAnimationView lottieAnimationView4 = lottieAnimationView;
                lottieAnimationView3.i(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.medal.MedalHelper$showPopupMedalDialogForRunningRoute$1$2$3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        lottieAnimationView4.setVisibility(4);
                    }
                });
            }
        });
        imageLoader.enqueue(builderTarget.build());
        TextView textView = (TextView) viewGroup.findViewById(iri.H);
        ImageView imageView = (ImageView) viewGroup.findViewById(iri.m);
        Button button = (Button) viewGroup.findViewById(iri.s);
        Intrinsics.checkNotNull(button);
        ViewExtKt.visible(button);
        button.setText(j0j.common_known);
        textView.setText(latestMedal.getName());
        final MedalDialog medalDialogCreate = new MedalDialog.Builder().setView(viewGroup).setCanceledOnTouchOutside(false).create();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        medalDialogCreate.show(supportFragmentManager);
        nuf.f(imageView);
        nuf.f(button);
        ViewExtKt.clickWithTrigger$default(button, 0L, new Function1() { // from class: gdf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalHelper.showPopupMedalDialogForRunningRoute$lambda$21(medalDialogCreate, (Button) obj);
            }
        }, 1, null);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showPopupMedalDialogForRunningRoute$lambda$22(medalDialogCreate, view);
            }
        });
    }

    public final void showSleepInterfereMedal(@NotNull FragmentActivity activity, @NotNull String title, @NotNull String subTitle, @NotNull String btnStr, @NotNull Function0<Unit> clickCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(btnStr, "btnStr");
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        SleepInterfereMedalUtils.INSTANCE.showSleepInterfereMedal(activity, title, subTitle, btnStr, clickCallback);
        this.hasDialog = true;
    }

    public final void showTrainingFinishPopDialog(@NotNull FragmentActivity activity, @NotNull String tip, @Nullable final Function0<Unit> dismissCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tip, "tip");
        View viewInflate = LayoutInflater.from(activity).inflate(pui.u, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        View viewFindViewById = viewGroup.findViewById(iri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(iri.o);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((LottieAnimationView) viewFindViewById2).w();
        lottieAnimationView.postDelayed(new Runnable() { // from class: edf
            @Override // java.lang.Runnable
            public final void run() {
                MedalHelper.showTrainingFinishPopDialog$lambda$27(lottieAnimationView);
            }
        }, 200L);
        lottieAnimationView.i(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.medal.MedalHelper.showTrainingFinishPopDialog.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                lottieAnimationView.setVisibility(4);
            }
        });
        TextView textView = (TextView) viewGroup.findViewById(iri.H);
        ImageView imageView = (ImageView) viewGroup.findViewById(iri.m);
        textView.setText(tip);
        Logger.d(this.TAG, "medalGot.text IS " + ((Object) textView.getText()));
        final MedalDialog medalDialogCreate = new MedalDialog.Builder().setView(viewGroup).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaomi.fitness.medal.MedalHelper$showTrainingFinishPopDialog$medalDialog$1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialog) {
                Function0<Unit> function0 = dismissCallback;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }).create();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        medalDialogCreate.show(supportFragmentManager);
        Logger.d(this.TAG, "medalGot.text IS " + ((Object) textView.getText()));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showTrainingFinishPopDialog$lambda$28(medalDialogCreate, view);
            }
        });
        this.hasDialog = true;
    }

    public final void showTrainingPopMedal(@NotNull FragmentActivity activity, int iconRes, @NotNull String tip, @Nullable final Function0<Unit> dismissCallback, @NotNull String userTip) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tip, "tip");
        Intrinsics.checkNotNullParameter(userTip, "userTip");
        View viewInflate = LayoutInflater.from(activity).inflate(pui.f, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        Button button = (Button) viewGroup.findViewById(iri.f);
        if (button != null) {
            ViewExtKt.invisible(button);
        }
        Button button2 = (Button) viewGroup.findViewById(iri.s);
        if (button2 != null) {
            ViewExtKt.invisible(button2);
        }
        View viewFindViewById = viewGroup.findViewById(iri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(iri.I);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final MedalIconView medalIconView = (MedalIconView) viewFindViewById2;
        int dp = ExtUtilsKt.getDp(Integer.valueOf(SportReportBaseParser.ReportType.avgDivingDepth));
        int medalListImgRatio = (int) (dp * MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getMedalListImgRatio(1));
        Integer numValueOf = Integer.valueOf(iconRes);
        ImageLoader imageLoader = Coil.imageLoader(medalIconView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(medalIconView.getContext()).data(numValueOf).target(medalIconView);
        builderTarget.size(dp, medalListImgRatio);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.medal.MedalHelper$showTrainingPopMedal$lambda$25$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                Bitmap bitmap = ((BitmapDrawable) result).getBitmap();
                medalIconView.setBitmap(bitmap);
                Logger.d(this.getTAG(), "medalIcon.bitmap IS " + bitmap);
                MedalIconView medalIconView2 = medalIconView;
                Property property = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(medalIconView2, (Property<MedalIconView, Float>) property, 0.0f, 0.8f);
                MedalIconView medalIconView3 = medalIconView;
                Property property2 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(medalIconView3, (Property<MedalIconView, Float>) property2, 0.0f, 0.8f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                animatorSet.setInterpolator(new ha9());
                animatorSet.setDuration(450L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(medalIconView, (Property<MedalIconView, Float>) property, 0.8f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(medalIconView, (Property<MedalIconView, Float>) property2, 0.8f, 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
                animatorSet2.setInterpolator(new ha9());
                MedalIconView medalIconView4 = medalIconView;
                medalIconView4.setPivotX(medalIconView4.getMeasuredWidth() / 2);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(medalIconView, "rotateY", 0.0f, 370.0f);
                objectAnimatorOfFloat5.setInterpolator(new ha9());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(animatorSet2).with(objectAnimatorOfFloat5);
                animatorSet3.setDuration(850L);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(medalIconView, "rotateY", 370.0f, 360.0f);
                objectAnimatorOfFloat6.setInterpolator(new ha9());
                objectAnimatorOfFloat6.setDuration(550L);
                final AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playSequentially(animatorSet, animatorSet3, objectAnimatorOfFloat6);
                final MedalIconView medalIconView5 = medalIconView;
                medalIconView5.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.medal.MedalHelper$showTrainingPopMedal$1$2$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Logger.d("BitmapLoaded startAnimator", new Object[0]);
                        medalIconView5.setVisibility(0);
                        animatorSet4.start();
                    }
                }, 250L);
                final LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                lottieAnimationView2.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.medal.MedalHelper$showTrainingPopMedal$1$2$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lottieAnimationView2.setVisibility(0);
                        lottieAnimationView2.w();
                    }
                }, 200L);
                LottieAnimationView lottieAnimationView3 = lottieAnimationView;
                final LottieAnimationView lottieAnimationView4 = lottieAnimationView;
                lottieAnimationView3.i(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.medal.MedalHelper$showTrainingPopMedal$1$2$3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        lottieAnimationView4.setVisibility(4);
                    }
                });
            }
        });
        imageLoader.enqueue(builderTarget.build());
        TextView textView = (TextView) viewGroup.findViewById(iri.H);
        TextView textView2 = (TextView) viewGroup.findViewById(iri.D);
        if (TextUtils.isEmpty(userTip)) {
            Intrinsics.checkNotNull(textView2);
            ViewExtKt.invisible(textView2);
        } else {
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(userTip);
            textView2.setMaxWidth(ExtUtilsKt.getDp(Integer.valueOf(SportReportBaseParser.ReportType.oxygenPartialPressureThreshold)));
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(iri.m);
        textView.setMaxWidth(ExtUtilsKt.getDp(235));
        textView.setText(tip);
        Logger.d(this.TAG, "medalGot.text IS " + ((Object) textView.getText()));
        final MedalDialog medalDialogCreate = new MedalDialog.Builder().setView(viewGroup).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaomi.fitness.medal.MedalHelper$showTrainingPopMedal$medalDialog$1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialog) {
                Function0<Unit> function0 = dismissCallback;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }).create();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        medalDialogCreate.show(supportFragmentManager);
        Logger.d(this.TAG, "medalGot.text IS " + ((Object) textView.getText()));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: udf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalHelper.showTrainingPopMedal$lambda$26(medalDialogCreate, view);
            }
        });
        this.hasDialog = true;
    }
}
