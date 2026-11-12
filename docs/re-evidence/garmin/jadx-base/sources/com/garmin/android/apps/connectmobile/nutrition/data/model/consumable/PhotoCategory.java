package com.garmin.android.apps.connectmobile.nutrition.data.model.consumable;

import androidx.annotation.Keep;
import g01.q;
import i63.c;
import i63.h;
import java.lang.annotation.Annotation;
import m63.k1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.a;
import w13.b;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/data/model/consumable/PhotoCategory;", "", "", "apiKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getApiKey", "()Ljava/lang/String;", "Companion", "a", "CUSTOM_FOOD", "CUSTOM_MEAL", "RECIPE", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public enum PhotoCategory {
    CUSTOM_FOOD("NUTRITION_CUSTOM_FOOD"),
    CUSTOM_MEAL("NUTRITION_CUSTOM_MEAL"),
    RECIPE("NUTRITION_RECIPE");

    private final String apiKey;
    private static final /* synthetic */ a $ENTRIES = b.g(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<c<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new q(18));

    PhotoCategory(String str) {
        this.apiKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return k1.d("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory", values(), new String[]{"NUTRITION_CUSTOM_FOOD", "NUTRITION_CUSTOM_MEAL", "NUTRITION_RECIPE"}, new Annotation[][]{null, null, null});
    }

    public static a<PhotoCategory> getEntries() {
        return $ENTRIES;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/data/model/consumable/PhotoCategory$a;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/nutrition/data/model/consumable/PhotoCategory;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final c<PhotoCategory> serializer() {
            return (c) PhotoCategory.$cachedSerializer$delegate.getValue();
        }

        private Companion() {
        }
    }
}
