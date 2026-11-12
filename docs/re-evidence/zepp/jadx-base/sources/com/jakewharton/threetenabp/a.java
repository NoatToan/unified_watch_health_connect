package com.jakewharton.threetenabp;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesInitializer;
import org.threeten.bp.zone.ZoneRulesProvider;

/* JADX INFO: loaded from: classes18.dex */
final class a extends ZoneRulesInitializer {
    private final Context c;
    private final String d;

    public a(Context context, String str) {
        this.c = context;
        this.d = str;
    }

    @Override // org.threeten.bp.zone.ZoneRulesInitializer
    public void initializeProviders() {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = this.c.getAssets().open(this.d);
                TzdbZoneRulesProvider tzdbZoneRulesProvider = new TzdbZoneRulesProvider(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                ZoneRulesProvider.registerProvider(tzdbZoneRulesProvider);
            } catch (IOException e) {
                throw new IllegalStateException(this.d + " missing from assets", e);
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
