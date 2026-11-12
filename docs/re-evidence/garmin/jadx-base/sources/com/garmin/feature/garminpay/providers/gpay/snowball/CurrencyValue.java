package com.garmin.feature.garminpay.providers.gpay.snowball;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import d53.w;
import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@JsonAdapter(Adapter.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "Ljava/io/Serializable;", "", "value", "Lko2/a;", "unit", "<init>", "(JLko2/a;)V", "Adapter", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CurrencyValue implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f51217c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ko2.a f51219b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue$Adapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Adapter extends TypeAdapter<CurrencyValue> {
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final CurrencyValue read2(JsonReader jsonReader) {
            jsonReader.getClass();
            String strNextString = jsonReader.nextString();
            strNextString.getClass();
            int length = w.c0(strNextString, ".", "").length();
            if (length > 2) {
                h.s("Cannot accept double values with fraction length > 2");
                return null;
            }
            if (length > 0) {
                a aVar = CurrencyValue.f51217c;
                long jD = MathKt.d(Double.parseDouble(strNextString) * ((double) 100));
                ko2.a.C2036a c2036a = ko2.a.f105769b;
                aVar.getClass();
                return a.a(jD, c2036a);
            }
            a aVar2 = CurrencyValue.f51217c;
            long j8 = Long.parseLong(strNextString);
            ko2.a.b bVar = ko2.a.f105768a;
            aVar2.getClass();
            return a.a(j8, bVar);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, CurrencyValue currencyValue) {
            CurrencyValue currencyValue2 = currencyValue;
            jsonWriter.getClass();
            currencyValue2.getClass();
            jsonWriter.value(currencyValue2.a());
        }
    }

    public CurrencyValue(long j8, ko2.a aVar) {
        aVar.getClass();
        this.f51218a = j8;
        this.f51219b = aVar;
    }

    public final double a() {
        return (this.f51218a * this.f51219b.getF105772d()) / ko2.a.f105768a.f105772d;
    }

    public final CurrencyValue b(CurrencyValue currencyValue) {
        if (currencyValue == null) {
            return this;
        }
        ko2.a aVar = currencyValue.f51219b;
        ko2.a aVar2 = this.f51219b;
        if (aVar2.getF105772d() >= aVar.getF105772d()) {
            return new CurrencyValue(c(aVar) + currencyValue.f51218a, aVar);
        }
        return new CurrencyValue(currencyValue.c(aVar2) + this.f51218a, aVar2);
    }

    public final long c(ko2.a aVar) {
        ko2.a aVar2 = this.f51219b;
        long f105772d = aVar2.getF105772d();
        long f105772d2 = f105772d % aVar.getF105772d();
        long j8 = this.f51218a;
        if (f105772d2 == 0) {
            return (f105772d / aVar.getF105772d()) * j8;
        }
        throw new IllegalArgumentException("Reminders blocks converting " + j8 + StringUtils.SPACE + aVar2 + " to " + aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyValue)) {
            return false;
        }
        CurrencyValue currencyValue = (CurrencyValue) obj;
        return this.f51218a == currencyValue.f51218a && this.f51219b == currencyValue.f51219b;
    }

    public final int hashCode() {
        return this.f51219b.hashCode() + (Long.hashCode(this.f51218a) * 31);
    }

    public final String toString() {
        return "CurrencyValue(value=" + this.f51218a + ", unit=" + this.f51219b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static CurrencyValue a(long j8, ko2.a aVar) {
            aVar.getClass();
            return new CurrencyValue(j8, aVar);
        }

        private a() {
        }
    }
}
