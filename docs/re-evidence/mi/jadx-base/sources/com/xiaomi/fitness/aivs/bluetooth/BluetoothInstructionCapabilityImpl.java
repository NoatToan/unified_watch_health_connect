package com.xiaomi.fitness.aivs.bluetooth;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import coil.target.Target;
import com.miui.tsmclient.util.ServiceUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.accountsdk.account.config.SystemAdStatus;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.track.TraceConstants;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Alerts;
import com.xiaomi.ai.api.Application;
import com.xiaomi.ai.api.BrightnessController;
import com.xiaomi.ai.api.CustomDirective;
import com.xiaomi.ai.api.Dialog;
import com.xiaomi.ai.api.Execution;
import com.xiaomi.ai.api.General;
import com.xiaomi.ai.api.Launcher;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.api.Speaker;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.WearableController;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.edge.EdgeNluFacade;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager;
import com.xiaomi.fitness.aivs.base.BaseEventSession;
import com.xiaomi.fitness.aivs.bluetooth.BluetoothInstructionCapabilityImpl;
import com.xiaomi.fitness.aivs.util.AivsMusicControl;
import com.xiaomi.fitness.aivs.util.AivsPreferenceSupport;
import com.xiaomi.fitness.aivs.util.BindVoiceAssistUtil;
import com.xiaomi.fitness.aivs.util.ReplyCallback;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.a11;
import defpackage.a21;
import defpackage.b08;
import defpackage.b11;
import defpackage.b21;
import defpackage.c11;
import defpackage.c21;
import defpackage.c4h;
import defpackage.d11;
import defpackage.d21;
import defpackage.e11;
import defpackage.e21;
import defpackage.eth;
import defpackage.f11;
import defpackage.f21;
import defpackage.g11;
import defpackage.gth;
import defpackage.h11;
import defpackage.hth;
import defpackage.i11;
import defpackage.i21;
import defpackage.j21;
import defpackage.k21;
import defpackage.kq2;
import defpackage.l01;
import defpackage.l11;
import defpackage.l21;
import defpackage.m01;
import defpackage.m11;
import defpackage.m21;
import defpackage.n11;
import defpackage.n21;
import defpackage.o11;
import defpackage.o21;
import defpackage.p01;
import defpackage.p11;
import defpackage.pzi;
import defpackage.q11;
import defpackage.r11;
import defpackage.r72;
import defpackage.s01;
import defpackage.s11;
import defpackage.s7r;
import defpackage.t01;
import defpackage.t11;
import defpackage.u01;
import defpackage.u11;
import defpackage.v01;
import defpackage.v11;
import defpackage.w01;
import defpackage.w11;
import defpackage.x01;
import defpackage.x11;
import defpackage.y01;
import defpackage.y11;
import defpackage.z01;
import defpackage.z11;
import defpackage.zsd;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u001b\u0010\u0016\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u001b\u0010\u0017\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u001b\u0010\u0018\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u001b\u0010\u0019\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u001b\u0010 \u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b \u0010\u0006J\u001f\u0010$\u001a\u00020\u00042\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b,\u0010\u0006J\u001b\u0010-\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b-\u0010\u0006J\u001d\u0010.\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b.\u0010'J\u001d\u0010/\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b/\u0010'J\u001d\u00100\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b0\u0010'J\u001d\u00101\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b1\u0010'J\u001d\u00102\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b2\u0010'J\u001d\u00103\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b3\u0010'J\u001d\u00104\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b4\u0010'J\u001d\u00105\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b5\u0010'J\u001d\u00106\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b6\u0010'J\u001d\u00107\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b7\u0010'J\u001d\u00108\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b8\u0010'J\u001b\u00109\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b9\u0010\u0006J\u001d\u0010:\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b:\u0010'J\u001d\u0010;\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b;\u0010'J\u001d\u0010<\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b<\u0010'J\u001d\u0010=\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b=\u0010'J\u001d\u0010>\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b>\u0010'J\u0019\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020\u00112\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000fH\u0002¢\u0006\u0004\b_\u0010]J\u0019\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010`\u001a\u00020\u000fH\u0003¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u0004¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020)2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020\u0004¢\u0006\u0004\bh\u0010eR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0017\u0010m\u001a\u00020l8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u001a0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0017\u0010t\u001a\u00020i8\u0006¢\u0006\f\n\u0004\bt\u0010k\u001a\u0004\bu\u0010vR\"\u0010w\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\bw\u0010+\"\u0004\by\u0010zR\u0017\u0010|\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR)\u0010\u0080\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothInstructionCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "", "processStreamImage", "(Lcom/xiaomi/ai/api/common/Instruction;)V", "Landroid/graphics/Bitmap;", "bitmap", "prepareSendImage", "(Landroid/graphics/Bitmap;)V", "Le11;", "it", "trySendImage", "(Le11;Landroid/graphics/Bitmap;)V", "", "filaPath", "", "segmentLength", "sendImage", "(Ljava/lang/String;I)V", "processFinishStream", "processIllegalContent", "processLanguageModelContent", "processLoadingCard", "processToastStream", "Lp01;", "processDialogFinish", "(Lp01;)V", "processNoContactPermission", "()Lp01;", "processPhoneCall", "processMakeCall", "", "Lcom/xiaomi/ai/api/Phone$Contact;", "contacts", "processShowContacts", "(Ljava/util/List;)V", "processPlaybackController", "(Lcom/xiaomi/ai/api/common/Instruction;)Lp01;", "processSpeaker", "", "getIsSupportMedia", "()Z", "processSpeechRecognizer", "processTemplateToast", "processTemplatePlayInfo", "processTemplateGeneral", "processTemplateGeneral2", "processTemplateWeather", "processTemplateLists", "processTemplateSwitchPanel", "processTemplateSwitchPanelList", "processTemplateDeviceList", "processAlertSet", "processDeliverAlertIntention", "processAlertStop", "processSpeechSynthesizerSpeak", "processSystemSetProperty", "processLauncherLaunchApp", "processExecuteDeviceSkill", "processBrightnessControllerAdjustBrightness", "processApplicationOperate", "Lcom/xiaomi/ai/api/Template$Title;", DeviceTagInterface.CUSTOM_TAG_TYPE, "Lf21;", "convertTitle", "(Lcom/xiaomi/ai/api/Template$Title;)Lf21;", "Lcom/xiaomi/ai/api/Template$RichText;", "text", "Lm11;", "convertRichText", "(Lcom/xiaomi/ai/api/Template$RichText;)Lm11;", "Lcom/xiaomi/ai/api/Template$AbstractItem;", "item", "Ll01;", "convertAbstractItem", "(Lcom/xiaomi/ai/api/Template$AbstractItem;)Ll01;", "Lcom/xiaomi/ai/api/Alerts$AlertDateTime;", "dateTime", "Ls01;", "convertAlertDateTime", "(Lcom/xiaomi/ai/api/Alerts$AlertDateTime;)Ls01;", "Lcom/xiaomi/ai/api/Speaker$VolumeType;", "type", "convertSpeakerVolumeType", "(Lcom/xiaomi/ai/api/Speaker$VolumeType;)I", "Lcom/xiaomi/ai/api/Speaker$UnitDef;", "unit", "convertSpeakerUnitDef", "(Lcom/xiaomi/ai/api/Speaker$UnitDef;)I", "src", "decode", "(Ljava/lang/String;)Ljava/lang/String;", "input", "unicodeToString", PluginDeviceInfo.FICONOFF, "Ljava/util/Date;", "parseDate", "(Ljava/lang/String;)Ljava/util/Date;", "clearInstructions", "()V", ServiceUtils.EXTRA_PROCESS, "(Lcom/xiaomi/ai/api/common/Instruction;)Z", "release", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;", "aivsService", "Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;", "getAivsService", "()Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;", "", "mInstructions", "Ljava/util/List;", "expectSpeechHandler", "getExpectSpeechHandler", "()Landroid/os/Handler;", "isSendQuery", "Z", "setSendQuery", "(Z)V", "Lcom/xiaomi/fitness/aivs/util/ReplyCallback;", "replyCallback", "Lcom/xiaomi/fitness/aivs/util/ReplyCallback;", "getReplyCallback", "()Lcom/xiaomi/fitness/aivs/util/ReplyCallback;", "finalASRResult", "Ljava/lang/String;", "getFinalASRResult", "()Ljava/lang/String;", "setFinalASRResult", "(Ljava/lang/String;)V", "<init>", "(Landroid/os/Handler;Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;)V", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBluetoothInstructionCapabilityImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothInstructionCapabilityImpl.kt\ncom/xiaomi/fitness/aivs/bluetooth/BluetoothInstructionCapabilityImpl\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1458:1\n844#2,9:1459\n37#3:1468\n36#3,3:1469\n*S KotlinDebug\n*F\n+ 1 BluetoothInstructionCapabilityImpl.kt\ncom/xiaomi/fitness/aivs/bluetooth/BluetoothInstructionCapabilityImpl\n*L\n409#1:1459,9\n632#1:1468\n632#1:1469,3\n*E\n"})
public final class BluetoothInstructionCapabilityImpl extends InstructionCapability {

    @NotNull
    private final BluetoothAivsService aivsService;

    @NotNull
    private final Handler expectSpeechHandler;

    @NotNull
    private String finalASRResult;

    @NotNull
    private final Handler handler;
    private boolean isSendQuery;

    @NotNull
    private final List<p01> mInstructions;

    @NotNull
    private final ReplyCallback replyCallback;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Speaker.VolumeType.values().length];
            try {
                iArr[Speaker.VolumeType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Speaker.VolumeType.RING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Speaker.VolumeType.NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Speaker.VolumeType.XIAOAI_VOICE_ASSISTANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Speaker.VolumeType.ALARM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Speaker.UnitDef.values().length];
            try {
                iArr2[Speaker.UnitDef.PERCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Speaker.UnitDef.ABSOLUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public BluetoothInstructionCapabilityImpl(@NotNull Handler handler, @NotNull BluetoothAivsService aivsService) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(aivsService, "aivsService");
        this.handler = handler;
        this.aivsService = aivsService;
        this.mInstructions = new ArrayList();
        this.expectSpeechHandler = new Handler(Looper.getMainLooper());
        ReplyCallback replyCallback = new ReplyCallback() { // from class: com.xiaomi.fitness.aivs.bluetooth.BluetoothInstructionCapabilityImpl$replyCallback$1
            @Override // com.xiaomi.fitness.aivs.util.ReplyCallback
            public void onReply(int code, String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                d21 d21Var = new d21();
                d21Var.c = msg;
                p01 p01Var = new p01();
                p01Var.c = 256;
                p01Var.f = d21Var;
                this.this$0.getAivsService().sendAivsInstruction(p01Var);
                p01 p01Var2 = new p01();
                p01Var2.c = 4;
                this.this$0.processDialogFinish(p01Var2);
                this.this$0.setSendQuery(false);
            }
        };
        this.replyCallback = replyCallback;
        BindVoiceAssistUtil bindVoiceAssistUtil = BindVoiceAssistUtil.INSTANCE;
        if (bindVoiceAssistUtil.isServiceConnected()) {
            bindVoiceAssistUtil.setReplyCallback(replyCallback);
        }
        this.finalASRResult = "";
    }

    private final l01 convertAbstractItem(Template.AbstractItem item) {
        l01 l01Var = new l01();
        String k2 = item.getK();
        Intrinsics.checkNotNullExpressionValue(k2, "getK(...)");
        l01Var.c = decode(k2);
        String v = item.getV();
        Intrinsics.checkNotNullExpressionValue(v, "getV(...)");
        l01Var.d = decode(v);
        return l01Var;
    }

    private final s01 convertAlertDateTime(Alerts.AlertDateTime dateTime) {
        s01 s01Var = new s01();
        s01Var.c = dateTime.getValue();
        s01Var.d = dateTime.getTimestamp();
        return s01Var;
    }

    private final m11 convertRichText(Template.RichText text) {
        m11 m11Var = new m11();
        m11Var.c = text.getText();
        if (text.getColor().c()) {
            String strB = text.getColor().b();
            Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
            m11Var.d = decode(strB);
        }
        if (text.getBgColor().c()) {
            String strB2 = text.getBgColor().b();
            Intrinsics.checkNotNullExpressionValue(strB2, "get(...)");
            m11Var.e = decode(strB2);
        }
        return m11Var;
    }

    private final int convertSpeakerUnitDef(Speaker.UnitDef unit) {
        int i = WhenMappings.$EnumSwitchMapping$1[unit.ordinal()];
        if (i != 1) {
            return i != 2 ? -1 : 1;
        }
        return 0;
    }

    private final int convertSpeakerVolumeType(Speaker.VolumeType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            i2 = 4;
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                return -1;
            }
        }
        return i2;
    }

    private final f21 convertTitle(Template.Title t) {
        f21 f21Var = new f21();
        String mainTitle = t.getMainTitle();
        Intrinsics.checkNotNullExpressionValue(mainTitle, "getMainTitle(...)");
        f21Var.c = decode(mainTitle);
        String subTitle = t.getSubTitle();
        Intrinsics.checkNotNullExpressionValue(subTitle, "getSubTitle(...)");
        f21Var.d = decode(subTitle);
        return f21Var;
    }

    private final String decode(String src) {
        return TextUtils.isEmpty(src) ? "" : unicodeToString(src);
    }

    private final boolean getIsSupportMedia() {
        return true;
    }

    @SuppressLint({"SimpleDateFormat"})
    private final Date parseDate(String d) {
        try {
            return new SimpleDateFormat("yyyyMMdd").parse(d);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSendImage(final Bitmap bitmap) {
        s7r s7rVar = new s7r();
        s7rVar.e = 14;
        s7rVar.f = 9;
        m01 m01Var = new m01();
        d11 d11Var = new d11();
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager();
        d11Var.c = mSpeechRecognizerManager != null ? mSpeechRecognizerManager.getCurrentSessionId() : (byte) 0;
        d11Var.d = bitmap.getWidth();
        d11Var.e = bitmap.getHeight();
        m01Var.r(d11Var);
        s7rVar.N(m01Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), this.aivsService.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.aivs.bluetooth.BluetoothInstructionCapabilityImpl.prepareSendImage.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(BaseAivsService.TAG, "prepareSendImage onError code:" + code);
                bitmap.recycle();
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                m01 m01VarP;
                e11 e11VarO;
                Logger.i(BaseAivsService.TAG, "prepareSendImage onSuccess");
                if (result == null || (packet = result.getPacket()) == null || (m01VarP = packet.p()) == null || (e11VarO = m01VarP.o()) == null) {
                    return;
                }
                Bitmap bitmap2 = bitmap;
                BluetoothInstructionCapabilityImpl bluetoothInstructionCapabilityImpl = this;
                int i = e11VarO.c;
                if (i == 0) {
                    AnyExtKt.io$default(null, new BluetoothInstructionCapabilityImpl$prepareSendImage$1$onSuccess$1$1(bluetoothInstructionCapabilityImpl, e11VarO, bitmap2, null), 1, null);
                    return;
                }
                Logger.i(BaseAivsService.TAG, "prepareSendImage prepareStatus is not ready:" + i);
                bitmap2.recycle();
            }
        }, 0, 16, (Object) null);
    }

    private final p01 processAlertSet(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.SetAlert");
        Alerts.SetAlert setAlert = (Alerts.SetAlert) payload;
        v01 v01Var = new v01();
        String id = setAlert.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        v01Var.c = decode(id);
        v01Var.d = setAlert.getType().getId();
        String datetime = setAlert.getDatetime();
        Intrinsics.checkNotNullExpressionValue(datetime, "getDatetime(...)");
        v01Var.e = decode(datetime);
        if (setAlert.getCircle().c()) {
            v01Var.f = setAlert.getCircle().b().getId();
        }
        if (setAlert.getCircleExtra().c()) {
            String strB = setAlert.getCircleExtra().b();
            Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
            v01Var.g = decode(strB);
        }
        if (setAlert.getOffset().c()) {
            String strB2 = setAlert.getOffset().b();
            Intrinsics.checkNotNullExpressionValue(strB2, "get(...)");
            v01Var.h = decode(strB2);
        }
        if (setAlert.getEvent().c()) {
            String strB3 = setAlert.getEvent().b();
            Intrinsics.checkNotNull(strB3);
            v01Var.i = decode(strB3);
        }
        p01 p01Var = new p01();
        p01Var.c = 263;
        p01Var.m = v01Var;
        return p01Var;
    }

    private final p01 processAlertStop(Instruction<?> instruction) {
        p01 p01Var = new p01();
        p01Var.c = 272;
        return p01Var;
    }

    private final p01 processApplicationOperate(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Application.Operate");
        Application.Operate operate = (Application.Operate) payload;
        if (operate.getApps().size() <= 0) {
            return null;
        }
        x01 x01Var = new x01();
        x01Var.c = operate.getOperation().getId();
        String keyword = operate.getKeyword();
        Intrinsics.checkNotNullExpressionValue(keyword, "getKeyword(...)");
        x01Var.d = decode(keyword);
        String pkgName = operate.getApps().get(0).getPkgName();
        Intrinsics.checkNotNullExpressionValue(pkgName, "getPkgName(...)");
        x01Var.e = decode(pkgName);
        p01 p01Var = new p01();
        p01Var.c = 270;
        p01Var.s = x01Var;
        return p01Var;
    }

    private final p01 processBrightnessControllerAdjustBrightness(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.BrightnessController.AdjustBrightness");
        y01 y01Var = new y01();
        y01Var.c = ((BrightnessController.AdjustBrightness) payload).getBrightnessDelta();
        p01 p01Var = new p01();
        p01Var.c = 268;
        p01Var.q = y01Var;
        return p01Var;
    }

    private final p01 processDeliverAlertIntention(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.DeliverAlertIntention");
        Alerts.DeliverAlertIntention deliverAlertIntention = (Alerts.DeliverAlertIntention) payload;
        u01 u01Var = new u01();
        u01Var.c = deliverAlertIntention.getType().getId();
        u01Var.d = deliverAlertIntention.getOperation().getId();
        u01Var.e = deliverAlertIntention.isOperateAll();
        if (deliverAlertIntention.getCircle().c()) {
            u01Var.f = deliverAlertIntention.getCircle().b().getId();
        }
        if (deliverAlertIntention.getCircleExtra().c()) {
            u01Var.g = deliverAlertIntention.getCircleExtra().b();
        }
        if (deliverAlertIntention.getEvent().c()) {
            u01Var.h = deliverAlertIntention.getEvent().b();
        }
        if (deliverAlertIntention.getFilterType().c()) {
            u01Var.i = deliverAlertIntention.getFilterType().b().getId();
        }
        if (deliverAlertIntention.getTime().c()) {
            t01 t01Var = new t01();
            t01Var.c = deliverAlertIntention.getTime().b().getType().getId();
            t01Var.d = deliverAlertIntention.getTime().b().getToken();
            if (deliverAlertIntention.getTime().b().getDatetime().c()) {
                Alerts.AlertDateTime alertDateTimeB = deliverAlertIntention.getTime().b().getDatetime().b();
                Intrinsics.checkNotNullExpressionValue(alertDateTimeB, "get(...)");
                t01Var.e = convertAlertDateTime(alertDateTimeB);
            }
            if (deliverAlertIntention.getTime().b().getStartDatetime().c()) {
                Alerts.AlertDateTime alertDateTimeB2 = deliverAlertIntention.getTime().b().getStartDatetime().b();
                Intrinsics.checkNotNullExpressionValue(alertDateTimeB2, "get(...)");
                t01Var.f = convertAlertDateTime(alertDateTimeB2);
            }
            if (deliverAlertIntention.getTime().b().getEndDatetime().c()) {
                Alerts.AlertDateTime alertDateTimeB3 = deliverAlertIntention.getTime().b().getEndDatetime().b();
                Intrinsics.checkNotNullExpressionValue(alertDateTimeB3, "get(...)");
                t01Var.g = convertAlertDateTime(alertDateTimeB3);
            }
            u01Var.j = t01Var;
        }
        p01 p01Var = new p01();
        p01Var.c = 271;
        p01Var.t = u01Var;
        return p01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processDialogFinish(p01 instruction) {
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager;
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = this.aivsService.getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager2 == null || !mSpeechRecognizerManager2.hasSession()) {
            this.mInstructions.clear();
            return;
        }
        this.mInstructions.add(instruction);
        p01.a aVar = new p01.a();
        aVar.c = new p01[this.mInstructions.size()];
        int size = this.mInstructions.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            aVar.c[i] = this.mInstructions.get(i);
            if (this.mInstructions.get(i).c == 265) {
                z = true;
            }
        }
        this.mInstructions.clear();
        this.aivsService.sendAivsInstructions(aVar);
        if (z || (mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager()) == null) {
            return;
        }
        mSpeechRecognizerManager.dialogFinish();
    }

    private final p01 processExecuteDeviceSkill(Instruction<?> instruction) {
        String strDecode;
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.CustomDirective.ExecuteDeviceSkill");
        c4h directive = ((CustomDirective.ExecuteDeviceSkill) payload).getDirective();
        if (directive == null) {
            return null;
        }
        a11 a11Var = new a11();
        w01 w01Var = new w01();
        zsd zsdVarW = directive.w("intent");
        zsd zsdVarW2 = zsdVarW.w("pkg_name");
        zsd zsdVarW3 = zsdVarW.w(SportRecordBundleKey.BUNDLE_PARAM_URI);
        String strDecode2 = "";
        if (zsdVarW2 != null) {
            String strL = zsdVarW2.l();
            Intrinsics.checkNotNullExpressionValue(strL, "asText(...)");
            strDecode = decode(strL);
        } else {
            strDecode = "";
        }
        w01Var.c = strDecode;
        if (zsdVarW3 != null) {
            String strL2 = zsdVarW3.l();
            Intrinsics.checkNotNullExpressionValue(strL2, "asText(...)");
            strDecode2 = decode(strL2);
        }
        w01Var.d = strDecode2;
        a11Var.c = w01Var;
        p01 p01Var = new p01();
        p01Var.c = 284;
        p01Var.z = a11Var;
        return p01Var;
    }

    private final void processFinishStream(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Nlp.FinishStream");
        p01 p01Var = new p01();
        p01Var.c = 293;
        this.aivsService.sendAivsInstruction(p01Var);
        Logger.d(BaseAivsService.TAG, "send llm FinishStream ");
    }

    private final void processIllegalContent(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Dialog.IllegalContent");
        c11 c11Var = new c11();
        String msg = ((Dialog.IllegalContent) payload).getMsg();
        Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
        String strDecode = decode(msg);
        c11Var.c = strDecode;
        p01 p01Var = new p01();
        p01Var.c = 291;
        p01Var.H = c11Var;
        this.aivsService.sendAivsInstruction(p01Var);
        Logger.d(BaseAivsService.TAG, "send llm IllegalContent  " + strDecode);
    }

    private final void processLanguageModelContent(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Nlp.LargeLanguageModelContent");
        Nlp.LargeLanguageModelContent largeLanguageModelContent = (Nlp.LargeLanguageModelContent) payload;
        b11 b11Var = new b11();
        if (largeLanguageModelContent.getBottomExplain().c()) {
            String strB = largeLanguageModelContent.getBottomExplain().b();
            Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
            b11Var.c = decode(strB);
        }
        p01 p01Var = new p01();
        p01Var.c = 290;
        p01Var.G = b11Var;
        this.aivsService.sendAivsInstruction(p01Var);
        Logger.d(BaseAivsService.TAG, "send llm declaration content " + b11Var.c);
    }

    private final p01 processLauncherLaunchApp(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Launcher.LaunchApp");
        Launcher.LaunchApp launchApp = (Launcher.LaunchApp) payload;
        if (!launchApp.getIntent().c()) {
            return null;
        }
        h11 h11Var = new h11();
        w01 w01Var = new w01();
        String pkgName = launchApp.getIntent().b().getPkgName();
        Intrinsics.checkNotNullExpressionValue(pkgName, "getPkgName(...)");
        w01Var.c = decode(pkgName);
        String uri = launchApp.getIntent().b().getUri();
        Intrinsics.checkNotNullExpressionValue(uri, "getUri(...)");
        w01Var.d = decode(uri);
        h11Var.c = w01Var;
        p01 p01Var = new p01();
        p01Var.c = 266;
        p01Var.o = h11Var;
        return p01Var;
    }

    private final void processLoadingCard(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.LLMLoadingCard");
        Template.LLMLoadingCard lLMLoadingCard = (Template.LLMLoadingCard) payload;
        f11 f11Var = new f11();
        if (lLMLoadingCard.getTimeout().c()) {
            f11Var.c = lLMLoadingCard.getTimeout().b().intValue() / 1000;
        }
        p01 p01Var = new p01();
        p01Var.c = 289;
        p01Var.F = f11Var;
        this.aivsService.sendAivsInstruction(p01Var);
        Logger.d(BaseAivsService.TAG, "send llm loading card timeout=" + f11Var.c);
    }

    private final void processMakeCall(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Phone.MakeCall");
        Phone.MakeCall makeCall = (Phone.MakeCall) payload;
        if (makeCall.getContact().c()) {
            p01 p01Var = new p01();
            p01Var.c = 286;
            Phone.Contact contactB = makeCall.getContact().b();
            n11.a aVar = new n11.a();
            aVar.d = contactB.getNumber();
            aVar.c = contactB.getName();
            p01Var.B = aVar;
            this.aivsService.sendAivsInstruction(p01Var);
        }
    }

    private final p01 processNoContactPermission() {
        p01 p01Var = new p01();
        p01Var.c = 285;
        n11 n11Var = new n11();
        n11Var.c = 1;
        p01Var.A = n11Var;
        return p01Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void processPhoneCall(Instruction<?> instruction) {
        hth.b().a(this.aivsService.getMClientId(), this.aivsService.getMModel()).getContext().i(true);
        List<Instruction> listA = null;
        b08 b08VarSolveAnswerV3 = EdgeNluFacade.getInstance().solveAnswerV3(null, CollectionsKt__CollectionsJVMKt.listOf(instruction), hth.b().a(this.aivsService.getMClientId(), this.aivsService.getMModel()));
        if (b08VarSolveAnswerV3 != null) {
            listA = b08VarSolveAnswerV3.a();
            eth.b().g((Instruction[]) listA.toArray(new Instruction[0]));
            Logger.e(BaseAivsService.TAG, "startNlp solveAnswerV3 Instruction result: " + listA);
        }
        if (listA == null) {
            Logger.d(BaseAivsService.TAG, "processPhoneCall finalInstructions is null");
            return;
        }
        for (Instruction instruction2 : listA) {
            String fullName = instruction2.getFullName();
            if (fullName != null) {
                switch (fullName.hashCode()) {
                    case -698913236:
                        if (fullName.equals(AIApiConstants.Phone.MakeCall)) {
                            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager();
                            if (mSpeechRecognizerManager != null) {
                                mSpeechRecognizerManager.setNeedPhoneContext(false);
                            }
                            processMakeCall(instruction2);
                        }
                        break;
                    case 574842803:
                        if (fullName.equals(AIApiConstants.Template.Toast)) {
                            processTemplateToast(instruction2);
                        }
                        break;
                    case 1247548208:
                        if (fullName.equals(AIApiConstants.Phone.ShowContacts)) {
                            Object payload = instruction2.getPayload();
                            Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Phone.ShowContacts");
                            processShowContacts(((Phone.ShowContacts) payload).getContacts());
                        }
                        break;
                    case 1631722339:
                        if (fullName.equals(AIApiConstants.SpeechRecognizer.ExpectSpeech)) {
                            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = this.aivsService.getMSpeechRecognizerManager();
                            if (mSpeechRecognizerManager2 != null) {
                                mSpeechRecognizerManager2.setNeedPhoneContext(true);
                            }
                            processSpeechRecognizer(instruction2);
                            if (this.aivsService.getTtsMode()) {
                                this.expectSpeechHandler.postDelayed(new Runnable() { // from class: i23
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BluetoothInstructionCapabilityImpl.processPhoneCall$lambda$6(this.f20685a);
                                    }
                                }, 3000L);
                            }
                        }
                        break;
                }
            }
        }
        gth.b(this.aivsService.getMClientId(), this.aivsService.getMModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processPhoneCall$lambda$6(BluetoothInstructionCapabilityImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this$0.aivsService.getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager != null) {
            mSpeechRecognizerManager.startExpectSpeech(null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final p01 processPlaybackController(Instruction<?> instruction) {
        String fullName;
        boolean isSupportMedia = getIsSupportMedia();
        p01 p01Var = new p01();
        p01Var.c = 273;
        if (isSupportMedia && (fullName = instruction.getFullName()) != null) {
            switch (fullName.hashCode()) {
                case -1954408854:
                    if (fullName.equals(AIApiConstants.PlaybackController.Next)) {
                        p01Var.c = 277;
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsControl(4);
                    }
                    break;
                case -1954343253:
                    if (fullName.equals(AIApiConstants.PlaybackController.Play)) {
                        p01Var.c = 275;
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsControl(0);
                    }
                    break;
                case -1954337366:
                    if (fullName.equals(AIApiConstants.PlaybackController.Prev)) {
                        p01Var.c = 278;
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsControl(3);
                    }
                    break;
                case -1954245767:
                    if (fullName.equals(AIApiConstants.PlaybackController.Stop)) {
                        p01Var.c = 274;
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsControl(2);
                    }
                    break;
                case -1234733648:
                    if (fullName.equals(AIApiConstants.PlaybackController.ContinuePlaying)) {
                        p01Var.c = 279;
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsControl(0);
                    }
                    break;
                case -455407265:
                    if (fullName.equals(AIApiConstants.PlaybackController.Pause)) {
                        p01Var.c = 276;
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsControl(1);
                    }
                    break;
            }
        }
        if (p01Var.u != 0) {
            this.aivsService.stopTtsPlay();
        }
        return p01Var;
    }

    private final void processShowContacts(List<? extends Phone.Contact> contacts) {
        String string;
        String str;
        if (contacts == null || contacts.isEmpty()) {
            return;
        }
        Iterator<? extends Phone.Contact> it = contacts.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Phone.Contact next = it.next();
            String number = next.getNumber();
            int length = number != null ? number.length() : 0;
            String number2 = next.getNumber();
            String string2 = number2 != null ? number2 : "";
            if (length > 3) {
                string2 = StringsKt__StringsKt.replaceRange((CharSequence) string2, 0, length - 3, (CharSequence) "****").toString();
            }
            Logger.i(BaseAivsService.TAG, "showContacts Phone.Contact:" + next.getName() + ":" + string2);
        }
        p01 p01Var = new p01();
        p01Var.c = 285;
        n11 n11Var = new n11();
        int size = contacts.size();
        n11.a[] aVarArr = new n11.a[size];
        n11Var.c = 0;
        int size2 = contacts.size();
        for (int i = 0; i < size2; i++) {
            Phone.Contact contact = contacts.get(i);
            n11.a aVar = new n11.a();
            aVar.c = contact.getName();
            aVar.d = contact.getNumber();
            aVarArr[i] = aVar;
        }
        for (int i2 = 0; i2 < size; i2++) {
            n11.a aVar2 = aVarArr[i2];
            int length2 = (aVar2 == null || (str = aVar2.d) == null) ? 0 : str.length();
            if (aVar2 == null || (string = aVar2.d) == null) {
                string = "";
            }
            if (length2 > 3) {
                string = StringsKt__StringsKt.replaceRange((CharSequence) string, 0, length2 - 3, (CharSequence) "****").toString();
            }
            Logger.i(BaseAivsService.TAG, "showContacts ContactData:" + (aVar2 != null ? aVar2.c : null) + " : " + string);
        }
        n11Var.d = aVarArr;
        p01Var.A = n11Var;
        this.aivsService.sendAivsInstruction(p01Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0137  */
    private final p01 processSpeaker(Instruction<?> instruction) {
        p01 p01Var;
        boolean isSupportMedia = getIsSupportMedia();
        String fullName = instruction.getFullName();
        if (fullName != null) {
            int iHashCode = fullName.hashCode();
            if (iHashCode != -1603244712) {
                if (iHashCode != 506647148) {
                    if (iHashCode == 1808506541 && fullName.equals(AIApiConstants.Speaker.SetVolume)) {
                        Object payload = instruction.getPayload();
                        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.SetVolume");
                        Speaker.SetVolume setVolume = (Speaker.SetVolume) payload;
                        p01Var = new p01();
                        p01Var.c = 281;
                        q11 q11Var = new q11();
                        p01Var.w = q11Var;
                        q11Var.c = setVolume.getVolume();
                        q11 q11Var2 = p01Var.w;
                        Speaker.VolumeType type = setVolume.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        q11Var2.d = convertSpeakerVolumeType(type);
                        q11 q11Var3 = p01Var.w;
                        Speaker.UnitDef unit = setVolume.getUnit();
                        Intrinsics.checkNotNullExpressionValue(unit, "getUnit(...)");
                        q11Var3.e = convertSpeakerUnitDef(unit);
                        if (setVolume.isOnce().c()) {
                            p01Var.w.f = setVolume.isOnce().b().booleanValue();
                        }
                        if (isSupportMedia) {
                            p01Var.u = AivsMusicControl.INSTANCE.onAivsSetVolume(setVolume.getVolume(), setVolume.getUnit() == Speaker.UnitDef.PERCENT);
                        }
                    } else {
                        p01Var = null;
                    }
                } else if (fullName.equals(AIApiConstants.Speaker.SetMute)) {
                    Object payload2 = instruction.getPayload();
                    Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.SetMute");
                    Speaker.SetMute setMute = (Speaker.SetMute) payload2;
                    p01Var = new p01();
                    p01Var.c = 280;
                    p11 p11Var = new p11();
                    p01Var.v = p11Var;
                    p11Var.c = setMute.isMute();
                    if (isSupportMedia) {
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsSetMute(setMute.isMute());
                    }
                } else {
                    p01Var = null;
                }
            } else if (fullName.equals(AIApiConstants.Speaker.AdjustVolume)) {
                Object payload3 = instruction.getPayload();
                Intrinsics.checkNotNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.AdjustVolume");
                Speaker.AdjustVolume adjustVolume = (Speaker.AdjustVolume) payload3;
                p01Var = new p01();
                p01Var.c = 282;
                o11 o11Var = new o11();
                p01Var.x = o11Var;
                o11Var.c = adjustVolume.getVolumeDelta();
                o11 o11Var2 = p01Var.x;
                Speaker.VolumeType type2 = adjustVolume.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                o11Var2.d = convertSpeakerVolumeType(type2);
                o11 o11Var3 = p01Var.x;
                Speaker.UnitDef unit2 = adjustVolume.getUnit();
                Intrinsics.checkNotNullExpressionValue(unit2, "getUnit(...)");
                o11Var3.e = convertSpeakerUnitDef(unit2);
                if (isSupportMedia) {
                    p01Var.u = AivsMusicControl.INSTANCE.onAivsAdjustVolume(adjustVolume.getVolumeDelta() >= 0);
                }
            } else {
                p01Var = null;
            }
        } else {
            p01Var = null;
        }
        if (p01Var != null && p01Var.u != 0) {
            this.aivsService.stopTtsPlay();
        }
        return p01Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void processSpeechRecognizer(Instruction<?> instruction) {
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager;
        BaseEventSession mEventSession;
        String fullName = instruction.getFullName();
        if (fullName != null) {
            int iHashCode = fullName.hashCode();
            if (iHashCode != 1327948931) {
                if (iHashCode != 1631722339) {
                    if (iHashCode == 1963775772 && fullName.equals(AIApiConstants.SpeechRecognizer.StopCapture)) {
                        this.handler.obtainMessage(1).sendToTarget();
                        p01 p01Var = new p01();
                        p01Var.c = 3;
                        this.aivsService.sendAivsInstruction(p01Var);
                        return;
                    }
                } else if (fullName.equals(AIApiConstants.SpeechRecognizer.ExpectSpeech)) {
                    p01 p01Var2 = new p01();
                    p01Var2.c = 265;
                    this.mInstructions.add(p01Var2);
                    Object payload = instruction.getPayload();
                    Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechRecognizer.ExpectSpeech");
                    SpeechRecognizer.ExpectSpeech expectSpeech = (SpeechRecognizer.ExpectSpeech) payload;
                    if (this.aivsService.getTtsMode()) {
                        this.aivsService.setExpectSpeech(expectSpeech);
                    } else {
                        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = this.aivsService.getMSpeechRecognizerManager();
                        if (mSpeechRecognizerManager2 != null) {
                            mSpeechRecognizerManager2.startExpectSpeech(expectSpeech.getPostBack().c() ? expectSpeech.getPostBack().b() : null);
                        }
                    }
                    if (!AppUtil.INSTANCE.isDevChannel() || (mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager()) == null || (mEventSession = mSpeechRecognizerManager.getMEventSession()) == null) {
                        return;
                    }
                    mEventSession.resetFileName();
                    return;
                }
            } else if (fullName.equals(AIApiConstants.SpeechRecognizer.RecognizeResult)) {
                Object payload2 = instruction.getPayload();
                Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechRecognizer.RecognizeResult");
                SpeechRecognizer.RecognizeResult recognizeResult = (SpeechRecognizer.RecognizeResult) payload2;
                List<SpeechRecognizer.RecognizeResultItem> results = recognizeResult.getResults();
                Logger.d(BaseAivsService.TAG, "RecognizeResult isFinal:" + recognizeResult.isFinal());
                String text = "";
                if (results != null) {
                    for (SpeechRecognizer.RecognizeResultItem recognizeResultItem : results) {
                        Logger.d(BaseAivsService.TAG, "RecognizeResultL:" + recognizeResultItem.getText());
                        text = recognizeResultItem.getText();
                    }
                }
                if (AppUtil.INSTANCE.isDevChannel() && recognizeResult.isFinal()) {
                    Logger.i(BaseAivsService.TAG, "RecognizeFinalResult " + text);
                    this.finalASRResult = text;
                }
                p01 p01Var3 = new p01();
                p01Var3.c = 2;
                r11 r11Var = new r11();
                r11Var.c = recognizeResult.isFinal();
                s11.a aVar = new s11.a();
                r11Var.d = aVar;
                if (results != null) {
                    aVar.c = new s11[results.size()];
                    for (int i = 0; i < results.size(); i++) {
                        s11 s11Var = new s11();
                        String text2 = results.get(i).getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        s11Var.c = decode(text2);
                        r11Var.d.c[i] = s11Var;
                    }
                } else {
                    aVar.c = new s11[0];
                }
                p01Var3.e = r11Var;
                this.aivsService.sendAivsInstruction(p01Var3);
                if (!recognizeResult.isFinal()) {
                    this.aivsService.doAsrFirstTrace(text);
                    return;
                }
                this.isSendQuery = false;
                this.handler.obtainMessage(1).sendToTarget();
                this.aivsService.doAsrFinalTrace(results.size() > 0 ? results.get(0) : null, text);
                return;
            }
        }
        Logger.d(BaseAivsService.TAG, "processSpeechRecognizer: unhandled name:" + fullName);
    }

    private final void processSpeechSynthesizerSpeak(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechSynthesizer.Speak");
        t11 t11Var = new t11();
        String text = ((SpeechSynthesizer.Speak) payload).getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        String strDecode = decode(text);
        if (strDecode.length() > 300) {
            String strSubstring = strDecode.substring(0, 300);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            t11Var.c = strSubstring;
        } else {
            t11Var.c = strDecode;
        }
        p01 p01Var = new p01();
        p01Var.c = 264;
        p01Var.n = t11Var;
        this.aivsService.sendAivsInstruction(p01Var);
    }

    private final void processStreamImage(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Template.StreamImageList streamImageList = payload instanceof Template.StreamImageList ? (Template.StreamImageList) payload : null;
        if (streamImageList == null) {
            return;
        }
        List<Template.Image> imageList = streamImageList.getImageList();
        if (imageList.size() > 0) {
            List<Template.ImageSource> sources = imageList.get(0).getSources();
            if (sources.size() > 0) {
                String url = sources.get(0).getUrl();
                Logger.i(BaseAivsService.TAG, "processStreamImage url:" + url);
                ImageLoaders.create(ApplicationExtKt.getApplication()).enqueue(new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(url).target(new Target() { // from class: com.xiaomi.fitness.aivs.bluetooth.BluetoothInstructionCapabilityImpl$processStreamImage$$inlined$target$default$1
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
                        Logger.i(BaseAivsService.TAG, "processStreamImage drawable.width:" + bitmap.getWidth() + " drawable.height:" + bitmap.getHeight());
                        if (bitmap.getWidth() > 330) {
                            bitmap.recycle();
                            return;
                        }
                        BluetoothInstructionCapabilityImpl bluetoothInstructionCapabilityImpl = this.this$0;
                        Intrinsics.checkNotNull(bitmap);
                        bluetoothInstructionCapabilityImpl.prepareSendImage(bitmap);
                    }
                }).build());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    private final p01 processSystemSetProperty(Instruction<?> instruction) {
        String value;
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Sys.SetProperty");
        Sys.SetProperty setProperty = (Sys.SetProperty) payload;
        v11 v11Var = new v11();
        String name = setProperty.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        v11Var.c = decode(name);
        String value2 = setProperty.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        v11Var.d = decode(value2);
        p01 p01Var = new p01();
        p01Var.c = 269;
        p01Var.f29861r = v11Var;
        if (Intrinsics.areEqual(setProperty.getName(), "MUTE_MODE") && getIsSupportMedia() && (value = setProperty.getValue()) != null) {
            int iHashCode = value.hashCode();
            if (iHashCode != -1836143820) {
                if (iHashCode != 2527) {
                    if (iHashCode == 78159 && value.equals(SystemAdStatus.SYSTEM_AD_OFF)) {
                        p01Var.u = AivsMusicControl.INSTANCE.onAivsSetMute(false);
                    }
                } else if (value.equals(SystemAdStatus.SYSTEM_AD_ON)) {
                    p01Var.u = AivsMusicControl.INSTANCE.onAivsSetMute(true);
                }
            } else if (value.equals("SWITCH")) {
                p01Var.u = AivsMusicControl.INSTANCE.onAivsSetMute(true);
            }
        }
        return p01Var;
    }

    private final p01 processTemplateDeviceList(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.DeviceList");
        Template.DeviceList deviceList = (Template.DeviceList) payload;
        w11 w11Var = new w11();
        w11Var.d = deviceList.getItems().size() > 5;
        w11Var.e = deviceList.isShowIndex();
        z01.a aVar = new z01.a();
        w11Var.c = aVar;
        aVar.c = new z01[RangesKt___RangesKt.coerceAtMost(deviceList.getItems().size(), 5)];
        for (int i = 0; i < deviceList.getItems().size() && i < w11Var.c.c.length; i++) {
            z01 z01Var = new z01();
            Template.Title title = deviceList.getItems().get(i).getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
            z01Var.c = convertTitle(title);
            w11Var.c.c[i] = z01Var;
        }
        p01 p01Var = new p01();
        p01Var.c = 283;
        p01Var.y = w11Var;
        return p01Var;
    }

    private final p01 processTemplateGeneral(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.General");
        Template.General general = (Template.General) payload;
        y11 y11Var = new y11();
        Template.Title title = general.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
        y11Var.c = convertTitle(title);
        String text = general.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        y11Var.d = decode(text);
        if (general.getAbstracts().c()) {
            l01.a aVar = new l01.a();
            aVar.c = new l01[general.getAbstracts().b().size()];
            int size = general.getAbstracts().b().size();
            for (int i = 0; i < size; i++) {
                l01[] l01VarArr = aVar.c;
                Template.AbstractItem abstractItem = general.getAbstracts().b().get(i);
                Intrinsics.checkNotNullExpressionValue(abstractItem, "get(...)");
                l01VarArr[i] = convertAbstractItem(abstractItem);
            }
            y11Var.e = aVar;
        }
        String description = general.getSkillIcon().getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        y11Var.f = decode(description);
        p01 p01Var = new p01();
        p01Var.c = 257;
        p01Var.g = y11Var;
        return p01Var;
    }

    private final p01 processTemplateGeneral2(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.General2");
        Template.General2 general2 = (Template.General2) payload;
        x11 x11Var = new x11();
        Template.RichText mainTitle = general2.getMainTitle();
        Intrinsics.checkNotNullExpressionValue(mainTitle, "getMainTitle(...)");
        x11Var.c = convertRichText(mainTitle);
        x11Var.d = new m11.a();
        x11Var.e = new m11.a();
        x11Var.d.c = new m11[general2.getSubTitles().size()];
        x11Var.e.c = new m11[general2.getTexts().size()];
        int size = general2.getSubTitles().size();
        for (int i = 0; i < size; i++) {
            m11[] m11VarArr = x11Var.d.c;
            Template.RichText richText = general2.getSubTitles().get(i);
            Intrinsics.checkNotNullExpressionValue(richText, "get(...)");
            m11VarArr[i] = convertRichText(richText);
        }
        int size2 = general2.getTexts().size();
        for (int i2 = 0; i2 < size2; i2++) {
            m11[] m11VarArr2 = x11Var.e.c;
            Template.RichText richText2 = general2.getTexts().get(i2);
            Intrinsics.checkNotNullExpressionValue(richText2, "get(...)");
            m11VarArr2[i2] = convertRichText(richText2);
        }
        String description = general2.getSkillIcon().getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        x11Var.f = decode(description);
        p01 p01Var = new p01();
        p01Var.c = SportSummary.VERSION_102;
        p01Var.h = x11Var;
        return p01Var;
    }

    private final p01 processTemplateLists(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Lists");
        Template.Lists lists = (Template.Lists) payload;
        z11 z11Var = new z11();
        String description = lists.getSkillIcon().getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        z11Var.c = decode(description);
        i11.a aVar = new i11.a();
        aVar.c = new i11[lists.getItems().size()];
        int size = lists.getItems().size();
        for (int i = 0; i < size; i++) {
            i11 i11Var = new i11();
            Template.Title title = lists.getItems().get(i).getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
            i11Var.c = convertTitle(title);
            String text = lists.getItems().get(i).getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            i11Var.d = decode(text);
            if (lists.getItems().get(i).getSkillIcon().c()) {
                String description2 = lists.getItems().get(i).getSkillIcon().b().getDescription();
                Intrinsics.checkNotNullExpressionValue(description2, "getDescription(...)");
                i11Var.e = decode(description2);
            }
            aVar.c[i] = i11Var;
        }
        z11Var.d = aVar;
        if (lists.getTitle().c()) {
            Template.Title titleB = lists.getTitle().b();
            Intrinsics.checkNotNullExpressionValue(titleB, "get(...)");
            z11Var.e = convertTitle(titleB);
        }
        p01 p01Var = new p01();
        p01Var.c = SportSummary.VERSION_105;
        p01Var.f29860k = z11Var;
        return p01Var;
    }

    private final p01 processTemplatePlayInfo(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.PlayInfo");
        Template.PlayInfo playInfo = (Template.PlayInfo) payload;
        a21 a21Var = new a21();
        a21Var.d = playInfo.getType().c() ? playInfo.getType().b().getId() : -1;
        if (playInfo.getSkillIcon().c()) {
            String description = playInfo.getSkillIcon().b().getDescription();
            Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
            a21Var.e = decode(description);
        }
        l11.a aVar = new l11.a();
        int iMin = Math.min(playInfo.getItems().size(), 1);
        aVar.c = new l11[iMin];
        for (int i = 0; i < iMin; i++) {
            Template.PlayInfoItem playInfoItem = playInfo.getItems().get(i);
            l11 l11Var = new l11();
            Template.Title title = playInfoItem.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
            l11Var.c = convertTitle(title);
            if (playInfoItem.getDurationInMs().c()) {
                l11Var.d = playInfoItem.getDurationInMs().b().intValue();
            }
            if (playInfoItem.getText().c()) {
                String strB = playInfoItem.getText().b();
                Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
                l11Var.e = decode(strB);
            }
            aVar.c[i] = l11Var;
        }
        a21Var.c = aVar;
        p01 p01Var = new p01();
        p01Var.c = 260;
        p01Var.j = a21Var;
        return p01Var;
    }

    private final p01 processTemplateSwitchPanel(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.SwitchPanel");
        Template.SwitchPanel switchPanel = (Template.SwitchPanel) payload;
        b21 b21Var = new b21();
        Template.Title title = switchPanel.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
        b21Var.c = convertTitle(title);
        String description = switchPanel.getSkillIcon().getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        b21Var.d = decode(description);
        if (switchPanel.getStatus().c()) {
            String strB = switchPanel.getStatus().b();
            Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
            b21Var.e = decode(strB);
        }
        if (switchPanel.getType().c()) {
            b21Var.f = switchPanel.getType().b().getId();
        }
        p01 p01Var = new p01();
        p01Var.c = 262;
        p01Var.l = b21Var;
        return p01Var;
    }

    private final p01 processTemplateSwitchPanelList(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.SwitchPanelList");
        Template.SwitchPanelList switchPanelList = (Template.SwitchPanelList) payload;
        c21 c21Var = new c21();
        u11.a aVar = new u11.a();
        aVar.c = new u11[switchPanelList.getTitles().size()];
        int size = switchPanelList.getTitles().size();
        for (int i = 0; i < size; i++) {
            u11 u11Var = new u11();
            Template.Title title = switchPanelList.getTitles().get(i).getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
            u11Var.c = convertTitle(title);
            if (switchPanelList.getTitles().get(i).getStatus().c()) {
                String strB = switchPanelList.getTitles().get(i).getStatus().b();
                Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
                u11Var.d = decode(strB);
            }
        }
        c21Var.c = aVar;
        String description = switchPanelList.getSkillIcon().getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        c21Var.d = decode(description);
        if (switchPanelList.getType().c()) {
            c21Var.e = switchPanelList.getType().b().getId();
        }
        if (switchPanelList.getItems().c()) {
            u11.a aVar2 = new u11.a();
            aVar2.c = new u11[switchPanelList.getItems().b().size()];
            int size2 = switchPanelList.getItems().b().size();
            for (int i2 = 0; i2 < size2; i2++) {
                u11 u11Var2 = new u11();
                Template.Title title2 = switchPanelList.getItems().b().get(i2).getTitle();
                Intrinsics.checkNotNullExpressionValue(title2, "getTitle(...)");
                u11Var2.c = convertTitle(title2);
                if (switchPanelList.getItems().b().get(i2).getStatus().c()) {
                    String strB2 = switchPanelList.getItems().b().get(i2).getStatus().b();
                    Intrinsics.checkNotNullExpressionValue(strB2, "get(...)");
                    u11Var2.d = decode(strB2);
                }
            }
            c21Var.f = aVar2;
        }
        p01 p01Var = new p01();
        p01Var.c = 267;
        p01Var.p = c21Var;
        return p01Var;
    }

    private final void processTemplateToast(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Toast");
        d21 d21Var = new d21();
        String text = ((Template.Toast) payload).getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        String strDecode = decode(text);
        if (strDecode.length() > 300) {
            String strSubstring = strDecode.substring(0, 300);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            d21Var.c = strSubstring;
        } else {
            d21Var.c = strDecode;
        }
        Logger.d(BaseAivsService.TAG, "templateToast.text:" + d21Var.c);
        p01 p01Var = new p01();
        p01Var.c = 256;
        p01Var.f = d21Var;
        this.aivsService.sendAivsInstruction(p01Var);
    }

    private final p01 processTemplateWeather(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Weather");
        Template.Weather weather = (Template.Weather) payload;
        e21 e21Var = new e21();
        l21.a aVar = new l21.a();
        e21Var.c = aVar;
        aVar.c = new l21[weather.getWeather().size()];
        int size = weather.getWeather().size();
        for (int i = 0; i < size; i++) {
            Template.WeatherItem weatherItem = weather.getWeather().get(i);
            l21 l21Var = new l21();
            String date = weatherItem.getDate();
            Intrinsics.checkNotNullExpressionValue(date, "getDate(...)");
            l21Var.c = decode(date);
            String date2 = weatherItem.getDate();
            Intrinsics.checkNotNullExpressionValue(date2, "getDate(...)");
            Date date3 = parseDate(date2);
            if (date3 != null) {
                l21Var.l = TimeDateUtil.INSTANCE.getWeekStr(date3.getTime());
            }
            String location = weatherItem.getLocation();
            Intrinsics.checkNotNullExpressionValue(location, "getLocation(...)");
            l21Var.d = decode(location);
            if (weatherItem.getAqi().c()) {
                String strB = weatherItem.getAqi().b();
                Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
                l21Var.e = decode(strB);
            }
            if (weatherItem.getCurrentTemperature().c()) {
                String strB2 = weatherItem.getCurrentTemperature().b();
                Intrinsics.checkNotNullExpressionValue(strB2, "get(...)");
                l21Var.f = decode(strB2);
            }
            if (weatherItem.getHighTemperature().c()) {
                String strB3 = weatherItem.getHighTemperature().b();
                Intrinsics.checkNotNullExpressionValue(strB3, "get(...)");
                l21Var.g = decode(strB3);
            }
            if (weatherItem.getLowTemperature().c()) {
                String strB4 = weatherItem.getLowTemperature().b();
                Intrinsics.checkNotNullExpressionValue(strB4, "get(...)");
                l21Var.h = decode(strB4);
            }
            if (weatherItem.getIcon().c()) {
                String description = weatherItem.getIcon().b().getDescription();
                Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
                l21Var.i = decode(description);
            }
            if (weatherItem.getWeatherCode().c()) {
                k21 k21Var = new k21();
                if (weatherItem.getWeatherCode().b().getCurrent().c()) {
                    String strB5 = weatherItem.getWeatherCode().b().getCurrent().b();
                    Intrinsics.checkNotNullExpressionValue(strB5, "get(...)");
                    k21Var.c = decode(strB5);
                }
                if (weatherItem.getWeatherCode().b().getFrom().c()) {
                    String strB6 = weatherItem.getWeatherCode().b().getFrom().b();
                    Intrinsics.checkNotNullExpressionValue(strB6, "get(...)");
                    k21Var.d = decode(strB6);
                }
                if (weatherItem.getWeatherCode().b().getTo().c()) {
                    String strB7 = weatherItem.getWeatherCode().b().getTo().b();
                    Intrinsics.checkNotNullExpressionValue(strB7, "get(...)");
                    k21Var.e = decode(strB7);
                }
                l21Var.j = k21Var;
            }
            if (weatherItem.getWind().c()) {
                m21 m21Var = new m21();
                if (weatherItem.getWind().b().getDirection().c()) {
                    Template.WeatherWindDirection weatherWindDirectionB = weatherItem.getWind().b().getDirection().b();
                    n21 n21Var = new n21();
                    m21Var.c = n21Var;
                    String text = weatherWindDirectionB.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    n21Var.c = decode(text);
                    if (weatherWindDirectionB.getCurrent().c()) {
                        n21 n21Var2 = m21Var.c;
                        String strB8 = weatherWindDirectionB.getCurrent().b();
                        Intrinsics.checkNotNullExpressionValue(strB8, "get(...)");
                        n21Var2.d = decode(strB8);
                    }
                    if (weatherWindDirectionB.getFrom().c()) {
                        n21 n21Var3 = m21Var.c;
                        String strB9 = weatherWindDirectionB.getFrom().b();
                        Intrinsics.checkNotNullExpressionValue(strB9, "get(...)");
                        n21Var3.e = decode(strB9);
                    }
                    if (weatherWindDirectionB.getTo().c()) {
                        n21 n21Var4 = m21Var.c;
                        String strB10 = weatherWindDirectionB.getTo().b();
                        Intrinsics.checkNotNullExpressionValue(strB10, "get(...)");
                        n21Var4.f = decode(strB10);
                    }
                }
                if (weatherItem.getWind().b().getSpeed().c()) {
                    Template.WeatherWindSpeed weatherWindSpeedB = weatherItem.getWind().b().getSpeed().b();
                    o21 o21Var = new o21();
                    m21Var.d = o21Var;
                    String text2 = weatherWindSpeedB.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    o21Var.c = decode(text2);
                    if (weatherWindSpeedB.getCurrent().c()) {
                        o21 o21Var2 = m21Var.d;
                        String strB11 = weatherWindSpeedB.getCurrent().b();
                        Intrinsics.checkNotNullExpressionValue(strB11, "get(...)");
                        o21Var2.d = decode(strB11);
                    }
                    if (weatherWindSpeedB.getFrom().c()) {
                        o21 o21Var3 = m21Var.d;
                        String strB12 = weatherWindSpeedB.getFrom().b();
                        Intrinsics.checkNotNullExpressionValue(strB12, "get(...)");
                        o21Var3.e = decode(strB12);
                    }
                    if (weatherWindSpeedB.getTo().c()) {
                        o21 o21Var4 = m21Var.d;
                        String strB13 = weatherWindSpeedB.getTo().b();
                        Intrinsics.checkNotNullExpressionValue(strB13, "get(...)");
                        o21Var4.f = decode(strB13);
                    }
                }
                l21Var.f24539k = m21Var;
            }
            e21Var.c.c[i] = l21Var;
        }
        String description2 = weather.getSkillIcon().getDescription();
        Intrinsics.checkNotNullExpressionValue(description2, "getDescription(...)");
        e21Var.d = decode(description2);
        p01 p01Var = new p01();
        p01Var.c = SportSummary.VERSION_103;
        p01Var.i = e21Var;
        return p01Var;
    }

    private final void processToastStream(Instruction<?> instruction) throws Throwable {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.ToastStream");
        Template.ToastStream toastStream = (Template.ToastStream) payload;
        g11 g11Var = new g11();
        String markdownText = toastStream.getMarkdownText();
        Intrinsics.checkNotNullExpressionValue(markdownText, "getMarkdownText(...)");
        String strDecode = decode(markdownText);
        g11Var.c = strDecode;
        Logger.d(BaseAivsService.TAG, "toastStream.markdownText:" + strDecode);
        if (AppUtil.INSTANCE.isDevChannel()) {
            File externalFilesDir = AppUtil.getApp().getExternalFilesDir("xiaoai.markdownfiles");
            if (externalFilesDir != null && !externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            String strB = instruction.getDialogId().b();
            File file = new File(externalFilesDir, this.finalASRResult + "-" + strB + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            r72.r(file.getAbsolutePath(), toastStream.getMarkdownText());
        }
        p01 p01Var = new p01();
        p01Var.c = 292;
        p01Var.I = g11Var;
        this.aivsService.sendAivsInstruction(p01Var);
    }

    private final void sendImage(String filaPath, int segmentLength) {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(this.aivsService.getDid(), 3, 6, filaPath, segmentLength, new SyncStateListener() { // from class: com.xiaomi.fitness.aivs.bluetooth.BluetoothInstructionCapabilityImpl.sendImage.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(BaseAivsService.TAG, "sendImage onFinish code:" + code + " is success:" + (code == 0));
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(BaseAivsService.TAG, "sendImage onStart");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(BaseAivsService.TAG, "sendImage onSyncing progress:" + progress);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trySendImage(e11 it, Bitmap bitmap) {
        Logger.i(BaseAivsService.TAG, "bitmapConfig:" + bitmap.getConfig());
        int i = it.d;
        Bitmap bitmapCopy = bitmap.copy((i == 2 || i == 3 || i == 7 || i == 8) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565, true);
        File file = new File(AppUtil.getApp().getExternalFilesDir("aivs-llm"), "llm-image-" + System.currentTimeMillis() + ".png");
        if (file.exists()) {
            file.delete();
        }
        String absolutePath = file.getAbsolutePath();
        Logger.i(BaseAivsService.TAG, "mutableBitmap.width:" + bitmapCopy.getWidth() + " mutableBitmap.height:" + bitmapCopy.getHeight());
        int i2 = it.d;
        if (i2 == 1) {
            kq2.f(bitmapCopy, absolutePath);
        } else if (i2 == 2) {
            kq2.k(bitmapCopy, absolutePath);
        } else if (i2 == 7) {
            kq2.h(bitmapCopy, absolutePath, true);
        } else if (i2 != 8) {
            kq2.d(bitmapCopy, absolutePath);
        } else {
            kq2.h(bitmapCopy, absolutePath, false);
        }
        Intrinsics.checkNotNull(absolutePath);
        sendImage(absolutePath, it.e);
    }

    private final String unicodeToString(String input) {
        String strGroup;
        Matcher matcher = Pattern.compile("(\\\\u(\\p{XDigit}{4}))").matcher(input);
        String strReplace$default = input;
        while (matcher.find() && (strGroup = matcher.group(2)) != null) {
            char c = (char) Integer.parseInt(strGroup, CharsKt__CharJVMKt.checkRadix(16));
            String strGroup2 = matcher.group(1);
            if (strGroup2 == null) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default, strGroup2, sb.toString(), false, 4, (Object) null);
        }
        return strReplace$default;
    }

    public final void clearInstructions() {
        this.mInstructions.clear();
    }

    @NotNull
    public final BluetoothAivsService getAivsService() {
        return this.aivsService;
    }

    @NotNull
    public final Handler getExpectSpeechHandler() {
        return this.expectSpeechHandler;
    }

    @NotNull
    public final String getFinalASRResult() {
        return this.finalASRResult;
    }

    @NotNull
    public final ReplyCallback getReplyCallback() {
        return this.replyCallback;
    }

    /* JADX INFO: renamed from: isSendQuery, reason: from getter */
    public final boolean getIsSendQuery() {
        return this.isSendQuery;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) throws Throwable {
        WearableController.DirectiveType directive;
        WearableController.DirectiveType directive2;
        String strName;
        WearableController.OperationType operation;
        WearableController.OperationType operation2;
        WearableController.OperationType operation3;
        String fullName;
        String toneId;
        String fullName2;
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Logger.i(BaseAivsService.TAG, "process instruction:" + instruction.getFullName() + " |DialogId: " + instruction.getDialogId() + " |Id: " + instruction.getId());
        String namespace = instruction.getNamespace();
        p01 p01VarProcessSystemSetProperty = null;
        if (namespace != null) {
            switch (namespace.hashCode()) {
                case -1803461041:
                    if (namespace.equals(AIApiConstants.System.NAME)) {
                        if (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.System.TruncationNotification)) {
                            this.handler.obtainMessage(1, instruction.getDialogId().b()).sendToTarget();
                            p01 p01Var = new p01();
                            p01Var.c = 5;
                            this.aivsService.sendAivsInstruction(p01Var);
                            return true;
                        }
                        if (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.System.SetProperty)) {
                            p01VarProcessSystemSetProperty = processSystemSetProperty(instruction);
                        } else if (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.System.Exception)) {
                            Object payload = instruction.getPayload();
                            Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Sys.Exception");
                            if (((Sys.Exception) payload).getCode() == 40110018) {
                                Logger.i(BaseAivsService.TAG, "System.Exception TOKEN_EXPIRED restart");
                                this.aivsService.restart();
                            }
                        }
                    }
                    break;
                case -1715388939:
                    if (namespace.equals(AIApiConstants.WearableController.NAME)) {
                        Logger.i(BaseAivsService.TAG, "WearableController fullName:" + instruction.getFullName());
                        p01 p01Var2 = new p01();
                        if (Intrinsics.areEqual(AIApiConstants.WearableController.Switch, instruction.getFullName())) {
                            p01Var2.c = 287;
                            j21 j21Var = new j21();
                            Object payload2 = instruction.getPayload();
                            WearableController.Switch r11 = payload2 instanceof WearableController.Switch ? (WearableController.Switch) payload2 : null;
                            Optional<Integer> modeId = r11 != null ? r11.getModeId() : null;
                            if (modeId == null || !modeId.c()) {
                                Logger.i(BaseAivsService.TAG, "WearableController switch modeId is not present");
                                return false;
                            }
                            j21Var.d = modeId.b().intValue();
                            if (r11 != null && (operation3 = r11.getOperation()) != null) {
                                j21Var.c = operation3.getId();
                            }
                            Logger.i(BaseAivsService.TAG, "WearableController Switch{mode:" + (r11 != null ? r11.getMode() : null) + " modeId:" + (r11 != null ? r11.getModeId() : null) + " operation:id = " + ((r11 == null || (operation2 = r11.getOperation()) == null) ? null : Integer.valueOf(operation2.getId())) + " name = " + ((r11 == null || (operation = r11.getOperation()) == null) ? null : operation.name()) + "}");
                            p01Var2.C = j21Var;
                            this.aivsService.sendAivsInstruction(p01Var2);
                        } else if (Intrinsics.areEqual(AIApiConstants.WearableController.Execute, instruction.getFullName())) {
                            p01Var2.c = 288;
                            i21 i21Var = new i21();
                            Object payload3 = instruction.getPayload();
                            WearableController.Execute execute = payload3 instanceof WearableController.Execute ? (WearableController.Execute) payload3 : null;
                            if (execute != null && (directive2 = execute.getDirective()) != null && (strName = directive2.name()) != null) {
                                i21Var.c = strName;
                            }
                            Logger.i(BaseAivsService.TAG, "WearableController Execute.directive:" + ((execute == null || (directive = execute.getDirective()) == null) ? null : directive.name()));
                            p01Var2.D = i21Var;
                            this.aivsService.sendAivsInstruction(p01Var2);
                        }
                    }
                    break;
                case -1350041530:
                    if (namespace.equals(AIApiConstants.SpeechRecognizer.NAME)) {
                        processSpeechRecognizer(instruction);
                    }
                    break;
                case -1342606400:
                    if (namespace.equals(AIApiConstants.Launcher.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Launcher.LaunchApp)) {
                        p01VarProcessSystemSetProperty = processLauncherLaunchApp(instruction);
                    }
                    break;
                case -1256902502:
                    if (namespace.equals(AIApiConstants.Template.NAME) && (fullName = instruction.getFullName()) != null) {
                        switch (fullName.hashCode()) {
                            case -1848811213:
                                if (fullName.equals(AIApiConstants.Template.LLMLoadingCard)) {
                                    processLoadingCard(instruction);
                                }
                                break;
                            case -554195084:
                                if (fullName.equals(AIApiConstants.Template.General)) {
                                    p01VarProcessSystemSetProperty = processTemplateGeneral(instruction);
                                }
                                break;
                            case -178370:
                                if (fullName.equals(AIApiConstants.Template.General2)) {
                                    p01VarProcessSystemSetProperty = processTemplateGeneral2(instruction);
                                }
                                break;
                            case 67886326:
                                if (fullName.equals(AIApiConstants.Template.PlayInfo)) {
                                    p01VarProcessSystemSetProperty = processTemplatePlayInfo(instruction);
                                }
                                break;
                            case 218381244:
                                if (fullName.equals(AIApiConstants.Template.SwitchPanel)) {
                                    p01VarProcessSystemSetProperty = processTemplateSwitchPanel(instruction);
                                }
                                break;
                            case 304115208:
                                if (fullName.equals(AIApiConstants.Template.DeviceList)) {
                                    p01VarProcessSystemSetProperty = processTemplateDeviceList(instruction);
                                }
                                break;
                            case 567293217:
                                if (fullName.equals(AIApiConstants.Template.Lists)) {
                                    p01VarProcessSystemSetProperty = processTemplateLists(instruction);
                                }
                                break;
                            case 574842803:
                                if (fullName.equals(AIApiConstants.Template.Toast)) {
                                    processTemplateToast(instruction);
                                }
                                break;
                            case 749393536:
                                if (fullName.equals(AIApiConstants.Template.Weather)) {
                                    p01VarProcessSystemSetProperty = processTemplateWeather(instruction);
                                }
                                break;
                            case 887890554:
                                if (fullName.equals(AIApiConstants.Template.SwitchPanelList)) {
                                    p01VarProcessSystemSetProperty = processTemplateSwitchPanelList(instruction);
                                }
                                break;
                            case 1043348357:
                                if (fullName.equals(AIApiConstants.Template.StreamImageList)) {
                                    processStreamImage(instruction);
                                }
                                break;
                            case 1460654355:
                                if (fullName.equals(AIApiConstants.Template.ToastStream)) {
                                    processToastStream(instruction);
                                }
                                break;
                        }
                    }
                    break;
                case -1072845520:
                    if (namespace.equals(AIApiConstants.Application.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Application.Operate)) {
                        p01VarProcessSystemSetProperty = processApplicationOperate(instruction);
                    }
                    break;
                case -674418963:
                    if (namespace.equals(AIApiConstants.BrightnessController.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.BrightnessController.AdjustBrightness)) {
                        p01VarProcessSystemSetProperty = processBrightnessControllerAdjustBrightness(instruction);
                    }
                    break;
                case -343869473:
                    if (namespace.equals(AIApiConstants.Speaker.NAME)) {
                        p01VarProcessSystemSetProperty = processSpeaker(instruction);
                    }
                    break;
                case 78418:
                    if (namespace.equals(AIApiConstants.Nlp.NAME)) {
                        if (Intrinsics.areEqual(AIApiConstants.Nlp.AuxiliaryIntention, instruction.getFullName()) && instruction.getPayload() != null) {
                            Object payload4 = instruction.getPayload();
                            Intrinsics.checkNotNull(payload4, "null cannot be cast to non-null type com.xiaomi.ai.api.Nlp.AuxiliaryIntention");
                            if (((Nlp.AuxiliaryIntention) payload4).getType() == Nlp.IntentionType.PHONE) {
                                if (this.aivsService.isNlpEdgeEngineReady()) {
                                    processPhoneCall(instruction);
                                } else if (this.aivsService.shouldRequestContactPermission()) {
                                    this.mInstructions.add(processNoContactPermission());
                                } else if (this.aivsService.isNlpEdgeEngineIdle()) {
                                    this.aivsService.initNlpEdge();
                                }
                            }
                        } else if (Intrinsics.areEqual(AIApiConstants.Nlp.StartAnswer, instruction.getFullName())) {
                            this.aivsService.traceTimeStamps(TraceConstants.TimeStamp.NLP.RECV_STARTANSWER);
                        } else if (Intrinsics.areEqual(AIApiConstants.Nlp.FinishAnswer, instruction.getFullName())) {
                            this.aivsService.traceTimeStamps(TraceConstants.TimeStamp.NLP.RECV_FINISHANSWER);
                            Logger.d(BaseAivsService.TAG, "Nlp.FinishAnswer ,getTtsMode:" + this.aivsService.getTtsMode());
                            if (this.aivsService.getTtsMode()) {
                                p01 p01Var3 = new p01();
                                p01Var3.c = 4;
                                processDialogFinish(p01Var3);
                            }
                        } else if (Intrinsics.areEqual(AIApiConstants.Nlp.LargeLanguageModelContent, instruction.getFullName())) {
                            processLanguageModelContent(instruction);
                        } else if (Intrinsics.areEqual(AIApiConstants.Nlp.FinishStream, instruction.getFullName())) {
                            processFinishStream(instruction);
                        }
                    }
                    break;
                case 249637943:
                    if (namespace.equals(AIApiConstants.PlaybackController.NAME)) {
                        p01VarProcessSystemSetProperty = processPlaybackController(instruction);
                    }
                    break;
                case 816161726:
                    if (namespace.equals(AIApiConstants.CustomDirective.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.CustomDirective.ExecuteDeviceSkill)) {
                        p01VarProcessSystemSetProperty = processExecuteDeviceSkill(instruction);
                    }
                    break;
                case 912993016:
                    if (namespace.equals(AIApiConstants.Execution.NAME) && Intrinsics.areEqual(AIApiConstants.Execution.CrossDeviceControlPhone, instruction.getFullName())) {
                        this.isSendQuery = true;
                        Object payload5 = instruction.getPayload();
                        Intrinsics.checkNotNull(payload5, "null cannot be cast to non-null type com.xiaomi.ai.api.Execution.CrossDeviceControlPhone");
                        Execution.CrossDeviceControlPhone crossDeviceControlPhone = (Execution.CrossDeviceControlPhone) payload5;
                        BindVoiceAssistUtil bindVoiceAssistUtil = BindVoiceAssistUtil.INSTANCE;
                        Logger.i(BaseAivsService.TAG, "CrossDeviceControlPhone isServiceConnected:" + bindVoiceAssistUtil.isServiceConnected());
                        if (crossDeviceControlPhone.getQuery().c() && bindVoiceAssistUtil.isServiceConnected()) {
                            bindVoiceAssistUtil.setReplyCallback(this.replyCallback);
                            String strB = crossDeviceControlPhone.getQuery().b();
                            Intrinsics.checkNotNullExpressionValue(strB, "get(...)");
                            bindVoiceAssistUtil.sendQuery(strB);
                        } else {
                            d21 d21Var = new d21();
                            d21Var.c = ResourceExtKt.getString(pzi.c);
                            p01 p01Var4 = new p01();
                            p01Var4.c = 256;
                            p01Var4.f = d21Var;
                            this.aivsService.sendAivsInstruction(p01Var4);
                            p01 p01Var5 = new p01();
                            p01Var5.c = 4;
                            processDialogFinish(p01Var5);
                            this.isSendQuery = false;
                        }
                    }
                    break;
                case 1584505032:
                    if (namespace.equals(AIApiConstants.General.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.General.SwitchTone)) {
                        Object payload6 = instruction.getPayload();
                        General.SwitchTone switchTone = payload6 instanceof General.SwitchTone ? (General.SwitchTone) payload6 : null;
                        if (switchTone == null || (toneId = switchTone.getToneId()) == null) {
                            toneId = "";
                        }
                        Logger.i(BaseAivsService.TAG, "process SwitchTone toneId:" + toneId);
                        AivsPreferenceSupport.INSTANCE.setToneId(this.aivsService.getDid(), toneId);
                    }
                    break;
                case 1963757239:
                    if (namespace.equals(AIApiConstants.Alerts.NAME) && (fullName2 = instruction.getFullName()) != null) {
                        int iHashCode = fullName2.hashCode();
                        if (iHashCode == -2108961186) {
                            if (fullName2.equals(AIApiConstants.Alerts.DeliverAlertIntention)) {
                                p01VarProcessSystemSetProperty = processDeliverAlertIntention(instruction);
                            }
                        } else if (iHashCode == -1663923229) {
                            if (fullName2.equals(AIApiConstants.Alerts.StopAlert)) {
                                p01VarProcessSystemSetProperty = processAlertStop(instruction);
                            }
                        } else if (iHashCode == -795955311 && fullName2.equals(AIApiConstants.Alerts.SetAlert)) {
                            p01VarProcessSystemSetProperty = processAlertSet(instruction);
                        }
                    }
                    break;
                case 2021675814:
                    if (namespace.equals(AIApiConstants.SpeechSynthesizer.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.SpeechSynthesizer.Speak)) {
                        processSpeechSynthesizerSpeak(instruction);
                    }
                    break;
                case 2046749032:
                    if (namespace.equals(AIApiConstants.Dialog.NAME)) {
                        if (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Dialog.Finish) && !this.aivsService.getTtsMode() && !this.isSendQuery) {
                            p01 p01Var6 = new p01();
                            p01Var6.c = 4;
                            processDialogFinish(p01Var6);
                        } else if (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Dialog.IllegalContent)) {
                            processIllegalContent(instruction);
                            this.aivsService.stopTtsPlay();
                        }
                        return true;
                    }
                    break;
            }
        }
        if (p01VarProcessSystemSetProperty != null) {
            this.mInstructions.add(p01VarProcessSystemSetProperty);
        }
        return true;
    }

    public final void release() {
        BindVoiceAssistUtil.INSTANCE.setReplyCallback(null);
    }

    public final void setFinalASRResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.finalASRResult = str;
    }

    public final void setSendQuery(boolean z) {
        this.isSendQuery = z;
    }
}
