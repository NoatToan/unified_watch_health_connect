package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: loaded from: classes7.dex */
interface ValueParser<V> {
    V parse(JsonReader jsonReader, float f14);
}
