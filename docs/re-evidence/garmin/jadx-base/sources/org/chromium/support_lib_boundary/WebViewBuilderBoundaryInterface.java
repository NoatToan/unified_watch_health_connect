package org.chromium.support_lib_boundary;

import am.j;
import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f133480a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f133481b = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f133482c = new ArrayList();

        @Override // java.util.function.Consumer
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.f133480a, new ArrayList(this.f133481b.keySet()), this.f133482c});
            if (this.profileName != null) {
                biConsumer.accept(3, this.profileName);
            }
        }

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            LinkedHashMap linkedHashMap = this.f133481b;
            if (linkedHashMap.containsKey(str)) {
                h.s(j.m("A duplicate JavaScript interface was provided for \"", str, "\""));
                return;
            }
            this.f133480a.add(obj);
            linkedHashMap.put(str, Boolean.TRUE);
            this.f133482c.add(list);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
        public static final int PROFILE_NAME = 3;
        public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
