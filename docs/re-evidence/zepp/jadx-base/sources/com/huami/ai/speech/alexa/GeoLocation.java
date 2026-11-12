package com.huami.ai.speech.alexa;

import com.huami.ai.speech.alexa.entity.payload.Altitude;
import com.huami.ai.speech.alexa.entity.payload.Coordinate;
import com.huami.ai.speech.alexa.entity.payload.Speed;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\b"}, d2 = {"Lcom/huami/ai/speech/alexa/GeoLocation;", "", "Lcom/huami/ai/speech/alexa/entity/payload/Coordinate;", "getCoordinate", "Lcom/huami/ai/speech/alexa/entity/payload/Altitude;", "getAltitude", "Lcom/huami/ai/speech/alexa/entity/payload/Speed;", "getSpeed", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface GeoLocation {
    @Nullable
    Altitude getAltitude();

    @Nullable
    Coordinate getCoordinate();

    @Nullable
    Speed getSpeed();
}
