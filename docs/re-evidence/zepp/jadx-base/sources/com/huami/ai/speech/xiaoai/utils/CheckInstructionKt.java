package com.huami.ai.speech.xiaoai.utils;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Alerts;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.Instruction;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b9\":\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\":\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\":\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n\":\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\":\u0010\u0017\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n\":\u0010\u001a\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\n\":\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\n\":\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\n\":\u0010#\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\"\u0010\n\":\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b%\u0010\n\":\u0010)\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b(\u0010\n\":\u0010,\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b+\u0010\n\":\u0010/\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\n\":\u00102\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b1\u0010\n\":\u00105\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b4\u0010\n\":\u00108\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\b\u001a\u0004\b7\u0010\n\":\u0010;\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b:\u0010\n\":\u0010>\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b=\u0010\n¨\u0006?"}, d2 = {"Lkotlin/Function1;", "Lcom/xiaomi/ai/api/common/Instruction;", "", "Lkotlin/ParameterName;", "name", "instruction", "", "a", "Lkotlin/jvm/functions/Function1;", "getCheckRecognizeResultInstruction", "()Lkotlin/jvm/functions/Function1;", "checkRecognizeResultInstruction", "b", "getCheckVADInstruction", "checkVADInstruction", "c", "getCheckFinishInstruction", "checkFinishInstruction", GoogleApiAvailabilityLight.a, "getCheckWeatherInstruction", "checkWeatherInstruction", "e", "getCheckSpeechSynthesizerInstruction", "checkSpeechSynthesizerInstruction", "f", "getCheckTemplateToastInstruction", "checkTemplateToastInstruction", "g", "getCheckAlertInstruction", "checkAlertInstruction", "h", "getCheckSetReminderInstruction", "checkSetReminderInstruction", "i", "getCheckAudioPlayInstruction", "checkAudioPlayInstruction", z.j, "getCheckCustomInstruction", "checkCustomInstruction", hl.k, "getCheckExpectSpeechInstruction", "checkExpectSpeechInstruction", "l", "getCheckTemplateListInstruction", "checkTemplateListInstruction", "m", "getCheckPlayInfoInstruction", "checkPlayInfoInstruction", GoogleApiAvailabilityLight.b, "getCheckPlaybackControllerInstruction", "checkPlaybackControllerInstruction", "o", "getCheckPlaybackControllerOfUnSupport", "checkPlaybackControllerOfUnSupport", com.google.android.exoplayer2.text.ttml.b.r, "getCheckSpeakerInstruction", "checkSpeakerInstruction", DTransferConstants.SEARCH_KEY, "getCheckBrightnessControllerInstruction", "checkBrightnessControllerInstruction", "r", "getCheckTemplateGeneralInstructionWithTextContent", "checkTemplateGeneralInstructionWithTextContent", "speech-xiaoai_release"}, k = 2, mv = {1, 5, 1})
public final class CheckInstructionKt {

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> a = j.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> b = q.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> c = f.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> d = r.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> e = m.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> f = p.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> g = a.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> h = k.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> i = b.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> j = d.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> k = e.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> l = o.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> m = g.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> n = h.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> o = i.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> p = l.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> q = c.a;

    @NotNull
    private static final Function1<Instruction<Object>, Boolean> r = n.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), "Alerts") && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Alerts.SetAlert);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), "AudioPlayer") && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.AudioPlayer.Play);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.BrightnessController.NAME) && (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.BrightnessController.AdjustBrightness) || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.BrightnessController.SetBrightness));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.CustomDirective.NAME);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), "SpeechRecognizer") && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.SpeechRecognizer.ExpectSpeech);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.Dialog.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Dialog.Finish);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.Template.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Template.PlayInfo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), "PlaybackController");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return (!Intrinsics.areEqual(instruction.getNamespace(), "PlaybackController") || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.PlaybackController.Play) || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.PlaybackController.Prev) || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.PlaybackController.Next) || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.PlaybackController.Pause)) ? false : true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.SpeechRecognizer.RecognizeResult);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            if (CheckInstructionKt.getCheckAlertInstruction().invoke(instruction).booleanValue()) {
                Object payload = instruction.getPayload();
                Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.SetAlert");
                if (((Alerts.SetAlert) payload).getType() == Alerts.AlertType.REMINDER) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), "Speaker") && (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Speaker.AdjustVolume) || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Speaker.SetVolume) || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Speaker.SetMute));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), "SpeechSynthesizer") && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.SpeechSynthesizer.Speak);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final n a = new n();

        public n() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            if (Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.Template.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Template.General)) {
                Object payload = instruction.getPayload();
                Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.General");
                if (((Template.General) payload).getText().length() > 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final o a = new o();

        public o() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.Template.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Template.DeviceList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final p a = new p();

        public p() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.Template.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Template.Toast);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final q a = new q();

        public q() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.SpeechRecognizer.StopCapture) || Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.System.TruncationNotification);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<Instruction<Object>, Boolean> {
        public static final r a = new r();

        public r() {
            super(1);
        }

        public final boolean a(@NotNull Instruction<Object> instruction) {
            return Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.Template.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Template.Weather);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Instruction<Object> instruction) {
            return Boolean.valueOf(a(instruction));
        }
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckAlertInstruction() {
        return g;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckAudioPlayInstruction() {
        return i;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckBrightnessControllerInstruction() {
        return q;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckCustomInstruction() {
        return j;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckExpectSpeechInstruction() {
        return k;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckFinishInstruction() {
        return c;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckPlayInfoInstruction() {
        return m;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckPlaybackControllerInstruction() {
        return n;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckPlaybackControllerOfUnSupport() {
        return o;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckRecognizeResultInstruction() {
        return a;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckSetReminderInstruction() {
        return h;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckSpeakerInstruction() {
        return p;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckSpeechSynthesizerInstruction() {
        return e;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckTemplateGeneralInstructionWithTextContent() {
        return r;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckTemplateListInstruction() {
        return l;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckTemplateToastInstruction() {
        return f;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckVADInstruction() {
        return b;
    }

    @NotNull
    public static final Function1<Instruction<Object>, Boolean> getCheckWeatherInstruction() {
        return d;
    }
}
