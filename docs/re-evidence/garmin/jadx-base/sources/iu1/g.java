package iu1;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class g<T> implements e<T> {

    public static class a<E> implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<E> f95057a;

        public a(Class<E> cls) {
            this.f95057a = cls;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return new Type[]{this.f95057a};
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return ArrayList.class;
        }
    }

    @Override // iu1.e
    public final List a(Class cls, String str) {
        if (TextUtils.isEmpty(str) || cls == null) {
            return null;
        }
        try {
            return (List) GsonUtil.f47253b.fromJson(str, new a(cls));
        } catch (JsonSyntaxException e4) {
            i2.i("GsonParser", "Syntax error parsing json response: " + e4.getMessage());
            return null;
        } catch (JsonParseException e14) {
            i2.i("GsonParser", "Error parsing json response: " + e14.getMessage());
            return null;
        }
    }

    @Override // iu1.e
    public final Object b(Class cls, String str) {
        if (TextUtils.isEmpty(str) || cls == null) {
            return null;
        }
        try {
            return GsonUtil.f47253b.fromJson(str, cls);
        } catch (JsonSyntaxException e4) {
            i2.i("GsonParser", "Syntax error parsing json response: " + e4.getMessage());
            return null;
        } catch (JsonParseException e14) {
            i2.i("GsonParser", "Error parsing json response: " + e14.getMessage());
            return null;
        }
    }
}
