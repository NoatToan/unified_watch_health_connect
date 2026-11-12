package c7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.firebase.perf.util.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l extends n {
    public static Font h(FontFamily fontFamily, int i14) {
        FontStyle fontStyle = new FontStyle((i14 & 1) != 0 ? Constants.FROZEN_FRAME_TIME : 400, (i14 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iK = k(fontStyle, font.getStyle());
        for (int i15 = 1; i15 < fontFamily.getSize(); i15++) {
            Font font2 = fontFamily.getFont(i15);
            int iK2 = k(fontStyle, font2.getStyle());
            if (iK2 < iK) {
                font = font2;
                iK = iK2;
            }
        }
        return font;
    }

    public static int k(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // c7.n
    public final Typeface a(Context context, b7.e.b bVar, Resources resources, int i14) {
        try {
            FontFamily.Builder builder = null;
            for (b7.e.c cVar : bVar.f16242a) {
                try {
                    Font fontBuild = new Font.Builder(resources, cVar.f16248f).setWeight(cVar.f16244b).setSlant(cVar.f16245c ? 1 : 0).setTtcIndex(cVar.f16247e).setFontVariationSettings(cVar.f16246d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i14).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // c7.n
    public final Typeface b(Context context, i7.l[] lVarArr, int i14) {
        try {
            FontFamily fontFamilyI = i(lVarArr, context.getContentResolver());
            if (fontFamilyI == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyI).setStyle(h(fontFamilyI, i14).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c7.n
    public final Typeface c(Context context, List list, int i14) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyI = i((i7.l[]) list.get(0), contentResolver);
            if (fontFamilyI == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyI);
            for (int i15 = 1; i15 < list.size(); i15++) {
                FontFamily fontFamilyI2 = i((i7.l[]) list.get(i15), contentResolver);
                if (fontFamilyI2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyI2);
                }
            }
            return customFallbackBuilder.setStyle(h(fontFamilyI, i14).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c7.n
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // c7.n
    public final Typeface e(Context context, Resources resources, int i14, String str, int i15) {
        try {
            Font fontBuild = new Font.Builder(resources, i14).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c7.n
    public final i7.l g(int i14, i7.l[] lVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final FontFamily i(i7.l[] lVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (i7.l lVar : lVarArr) {
            if (Objects.equals(lVar.f91937a.getScheme(), "systemfont")) {
                fontBuild = j(lVar);
            } else {
                try {
                    Uri uri = lVar.f91937a;
                    String str = lVar.f91941e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(lVar.f91939c).setSlant(lVar.f91940d ? 1 : 0).setTtcIndex(lVar.f91938b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font j(i7.l lVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
