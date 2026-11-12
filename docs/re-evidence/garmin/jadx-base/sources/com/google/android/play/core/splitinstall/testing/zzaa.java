package com.google.android.play.core.splitinstall.testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaa {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("LocalTestingConfigParser");
    private final XmlPullParser zzb;
    private final zzu zzc = zzv.zzc();

    public zzaa(XmlPullParser xmlPullParser) {
        this.zzb = xmlPullParser;
    }

    public static zzv zza(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return zzv.zza;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final zzaa zzaaVar = new zzaa(xmlPullParserNewPullParser);
                zzaaVar.zze("local-testing-config", new zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzy
                    @Override // com.google.android.play.core.splitinstall.testing.zzz
                    public final void zza() throws XmlPullParserException, IOException {
                        this.zza.zzd();
                    }
                });
                zzv zzvVarZze = zzaaVar.zzc.zze();
                fileReader.close();
                return zzvVarZze;
            } catch (Throwable th3) {
                try {
                    fileReader.close();
                } catch (Throwable th4) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    } catch (Exception unused) {
                    }
                }
                throw th3;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e4) {
            zza.zze("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e4.getMessage());
            return zzv.zza;
        }
    }

    public static /* synthetic */ void zzb(final zzaa zzaaVar) throws XmlPullParserException, IOException {
        for (int i14 = 0; i14 < zzaaVar.zzb.getAttributeCount(); i14++) {
            if ("defaultErrorCode".equals(zzaaVar.zzb.getAttributeName(i14))) {
                zzaaVar.zzc.zza(com.google.android.play.core.splitinstall.model.zza.zza(zzaaVar.zzb.getAttributeValue(i14)));
            }
        }
        zzaaVar.zze("split-install-error", new zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzw
            @Override // com.google.android.play.core.splitinstall.testing.zzz
            public final void zza() throws XmlPullParserException {
                zzaa.zzc(this.zza);
            }
        });
    }

    public static /* synthetic */ void zzc(zzaa zzaaVar) throws XmlPullParserException {
        String attributeValue = null;
        String attributeValue2 = null;
        for (int i14 = 0; i14 < zzaaVar.zzb.getAttributeCount(); i14++) {
            if ("module".equals(zzaaVar.zzb.getAttributeName(i14))) {
                attributeValue = zzaaVar.zzb.getAttributeValue(i14);
            }
            if ("errorCode".equals(zzaaVar.zzb.getAttributeName(i14))) {
                attributeValue2 = zzaaVar.zzb.getAttributeValue(i14);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", zzaaVar.zzb, null);
        }
        zzaaVar.zzc.zzd().put(attributeValue, Integer.valueOf(com.google.android.play.core.splitinstall.model.zza.zza(attributeValue2)));
        while (zzaaVar.zzb.next() != 3) {
        }
    }

    private final void zze(String str, zzz zzzVar) throws XmlPullParserException, IOException {
        while (true) {
            int next = this.zzb.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.zzb.getEventType() == 2) {
                if (!this.zzb.getName().equals(str)) {
                    throw new XmlPullParserException(e0.g("Expected '", str, "' tag but found '", this.zzb.getName(), "'."), this.zzb, null);
                }
                zzzVar.zza();
            }
        }
    }

    public final /* synthetic */ void zzd() throws XmlPullParserException, IOException {
        zze("split-install-errors", new zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzx
            @Override // com.google.android.play.core.splitinstall.testing.zzz
            public final void zza() throws XmlPullParserException, IOException {
                zzaa.zzb(this.zza);
            }
        });
    }
}
