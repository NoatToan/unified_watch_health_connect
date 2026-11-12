package com.garmin.android.apps.connectmobile.hydration.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import java.util.List;
import op0.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/model/HydrationContainersAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HydrationContainersAdapterFactory implements TypeAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!s.g(typeToken, TypeToken.getParameterized(List.class, a.class))) {
            return null;
        }
        final TypeAdapter<T> adapter = gson != null ? gson.getAdapter(typeToken) : null;
        return new TypeAdapter<T>() { // from class: com.garmin.android.apps.connectmobile.hydration.model.HydrationContainersAdapterFactory.create.1
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public final T read2(JsonReader jsonReader) {
                TypeAdapter<T> typeAdapter = adapter;
                T t7 = typeAdapter != null ? typeAdapter.read2(jsonReader) : null;
                t7.getClass();
                int i14 = 0;
                for (T t14 : (List) t7) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    a aVar = (a) t14;
                    int i16 = 1;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            i16 = 2;
                        } else if (i14 == 2) {
                            i16 = 3;
                        }
                    }
                    aVar.k(i16);
                    aVar.d();
                    i14 = i15;
                }
                return t7;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, T t7) {
                t7.getClass();
                Iterator<T> it = ((List) t7).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b();
                }
                TypeAdapter<T> typeAdapter = adapter;
                if (typeAdapter != null) {
                    typeAdapter.write(jsonWriter, t7);
                }
            }
        };
    }
}
