package com.huami.ai.speech.alexa.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.speech.alexa.JsonMultipart;
import com.huami.ai.speech.alexa.MultipartResponse;
import com.huami.ai.speech.alexa.StreamMultipart;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.PayloadFactory;
import com.huami.ai.speech.alexa.entity.payload.PlayPayload;
import com.huami.ai.speech.alexa.entity.payload.SpeakPayload;
import com.huami.ai.speech.alexa.entity.payload.UnsupportedPayloadException;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveEntityFactory;", "", "<init>", "()V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class DirectiveEntityFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int a = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\f\u001a\u00020\u000b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001a\u0010\u000e\u001a\u00020\u000b*\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b2\u0006\u0010\n\u001a\u00020\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveEntityFactory$Companion;", "", "", "json", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "c", "Lcom/huami/ai/speech/alexa/entity/payload/SpeakPayload;", "", "Lcom/huami/ai/speech/alexa/StreamMultipart;", "data", "", "b", "Lcom/huami/ai/speech/alexa/entity/payload/PlayPayload;", "a", "url", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/speech/alexa/MultipartResponse;", "createDirectiveContent", "", "CID_STR_LENGTH", LogUtil.I, "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ UnsupportedPayloadException a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UnsupportedPayloadException unsupportedPayloadException) {
                super(0);
                this.a = unsupportedPayloadException;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("UnsupportedPayloadException: ", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ JsonMultipart a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(JsonMultipart jsonMultipart) {
                super(0);
                this.a = jsonMultipart;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.getJson();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(PlayPayload playPayload, List<StreamMultipart> list) {
            Object obj = null;
            if (m.startsWith$default(playPayload.getAudioItem().getStream().getUrl(), "cid", false, 2, null)) {
                String strD = d(playPayload.getAudioItem().getStream().getUrl());
                if (strD.length() == 0) {
                    return;
                }
                for (Object obj2 : list) {
                    if (Intrinsics.areEqual(((StreamMultipart) obj2).getContentId(), strD)) {
                        obj = obj2;
                        break;
                    }
                }
                StreamMultipart streamMultipart = (StreamMultipart) obj;
                if (streamMultipart == null) {
                    return;
                }
                playPayload.setAudio(new AudioContent(streamMultipart.getStream(), streamMultipart.getContentId()));
            }
        }

        private final void b(SpeakPayload speakPayload, List<StreamMultipart> list) {
            Object next;
            String strD = d(speakPayload.getUrl());
            if (strD.length() == 0) {
                return;
            }
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((StreamMultipart) next).getContentId(), strD));
            StreamMultipart streamMultipart = (StreamMultipart) next;
            if (streamMultipart == null) {
                return;
            }
            speakPayload.setAudio(new AudioContent(streamMultipart.getStream(), streamMultipart.getContentId()));
        }

        private final DirectiveContent<Payload> c(String json) {
            JSONObject jSONObjectOptJSONObject = new JSONObject(json).optJSONObject("directive");
            Header headerFromJson = Header.INSTANCE.fromJson(String.valueOf(jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONObject("header")));
            return new DirectiveContent<>(headerFromJson, PayloadFactory.INSTANCE.createPayloadByHeader(headerFromJson, String.valueOf(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("payload") : null)));
        }

        private final String d(String url) {
            return Intrinsics.areEqual(StringsKt__StringsKt.split$default((CharSequence) url, new String[]{":"}, false, 0, 6, (Object) null).get(0), "cid") ? StringsKt___StringsKt.drop(url, 4) : "";
        }

        @NotNull
        public final List<DirectiveContent<Payload>> createDirectiveContent(@NotNull MultipartResponse data) {
            ArrayList arrayList = new ArrayList();
            Iterator<JsonMultipart> it2 = data.getJsonParts().iterator();
            while (it2.hasNext()) {
                try {
                    DirectiveContent<Payload> directiveContentC = c(it2.next().getJson());
                    Payload payload = directiveContentC.getPayload();
                    if (payload instanceof SpeakPayload) {
                        DirectiveEntityFactory.INSTANCE.b((SpeakPayload) directiveContentC.getPayload(), data.getStreamParts());
                    } else if (payload instanceof PlayPayload) {
                        DirectiveEntityFactory.INSTANCE.a((PlayPayload) directiveContentC.getPayload(), data.getStreamParts());
                    }
                    arrayList.add(directiveContentC);
                } catch (UnsupportedPayloadException e) {
                    HMLog.error$default("speech", null, null, new a(e), 6, null);
                    Iterator<T> it3 = data.getJsonParts().iterator();
                    while (it3.hasNext()) {
                        HMLog.debug$default(null, new b((JsonMultipart) it3.next()), 1, null);
                    }
                }
            }
            return arrayList;
        }
    }
}
