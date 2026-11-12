package androidx.media3.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import com.garmin.device.nfc.NfcCommandHandler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.common.base.Ascii;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.net.MediaType;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.u0;
import tn2.e1;
import tn2.f1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8350a;

    /* JADX WARN: Code duplicated, block: B:210:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:212:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:215:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:216:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:217:0x0600  */
    /* JADX WARN: Code duplicated, block: B:228:0x0660  */
    /* JADX WARN: Code duplicated, block: B:230:0x0664  */
    /* JADX WARN: Code duplicated, block: B:233:0x066f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0678  */
    /* JADX WARN: Code duplicated, block: B:235:0x067d  */
    /* JADX WARN: Instruction removed from duplicated block: B:217:0x0600, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:235:0x067d, please report this as an issue */
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) throws IOException, NfcCommandHandler.NfcCapabilityException {
        byte[] bArrD;
        byte[] bArrD2;
        com.garmin.device.nfc.h hVar;
        int i14 = 14;
        switch (this.f8350a) {
            case 0:
                s sVar = (s) obj;
                q qVar = q.N;
                return sVar.f8435a + ": " + sVar.f8436b;
            case 1:
                return new ja.m((fa.c) obj);
            case 2:
                return Mp4Extractor.lambda$processMoovAtom$1((Track) obj);
            case 3:
                return MediaType.lambda$computeToString$0((String) obj);
            case 4:
                return ImmutableMultiset.copyOf((Collection) obj);
            case 5:
                byte[] bArr = (byte[]) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService = jn2.m.f99646l;
                if (bArr != null) {
                    return Boolean.valueOf(bArr[0] == 1);
                }
                vb.h.C("Failed to remove express card, app request incorrect");
                return null;
            case 6:
                byte[] bArr2 = (byte[]) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService2 = jn2.m.f99646l;
                bArr2.getClass();
                if (bArr2.length > 1) {
                    LinkedHashMap linkedHashMapB = new f1().b(bArr2);
                    return Optional.of(new hs2.c((byte[]) u0.c(new e1.a(Ascii.FF), linkedHashMapB), new String((byte[]) u0.c(new e1.a(2), linkedHashMapB), d53.c.f57666b), ByteBuffer.wrap((byte[]) u0.c(new e1.a(17), linkedHashMapB)).order(ByteOrder.LITTLE_ENDIAN).getFloat()));
                }
                if (bArr2[0] == 1) {
                    return Optional.absent();
                }
                vb.h.C("Failed to get express card, app request incorrect");
                return null;
            case 7:
                byte[] bArr3 = (byte[]) obj;
                ListeningScheduledExecutorService listeningScheduledExecutorService3 = jn2.m.f99646l;
                if (bArr3 != null) {
                    return Boolean.valueOf(bArr3[0] == 1);
                }
                vb.h.C("Failed to set express card, app request incorrect");
                return null;
            case 8:
                ma.o oVar = (ma.o) obj;
                oVar.h();
                return ImmutableList.copyOf((Collection) Lists.transform(oVar.Y.f158154b, new p(i14)));
            case 9:
                if (((com.garmin.device.nfc.i) obj) != null) {
                    NfcCommandHandler.f50799g.debug("Completed APP_CAPABILITIES request");
                    return Unit.INSTANCE;
                }
                Logger logger = NfcCommandHandler.f50799g;
                throw new NfcCommandHandler.NfcCapabilityException("Received null response from the device", rl2.a.DEVICE_FAILED_APP_CAPABILITIES);
            case 10:
                com.garmin.device.nfc.i iVar = (com.garmin.device.nfc.i) obj;
                NfcCommandHandler.f50799g.debug("Received DEVICE_WALLET_STATE_REQUEST");
                if (iVar == null) {
                    return null;
                }
                byte[] bArrD3 = iVar.d();
                Logger logger2 = com.garmin.device.nfc.b.f50847l;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrD3, 1, bArrD3.length);
                Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
                ArrayList<com.garmin.device.nfc.h> arrayList = new ArrayList();
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrCopyOfRange).order(ByteOrder.LITTLE_ENDIAN);
                while (byteBufferOrder.hasRemaining()) {
                    try {
                        com.garmin.device.nfc.h.c cVarA = com.garmin.device.nfc.h.c.a(byteBufferOrder.get());
                        byte[] bArr4 = new byte[byteBufferOrder.getInt()];
                        byteBufferOrder.get(bArr4);
                        hVar = new com.garmin.device.nfc.h(cVarA, bArr4);
                    } catch (Exception e4) {
                        com.garmin.device.nfc.h.f50883b.error("Received incorrect TLV", (Throwable) e4);
                        hVar = null;
                    }
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                    break;
                }
                ArrayList arrayList2 = new ArrayList();
                com.garmin.device.nfc.b bVar = null;
                for (com.garmin.device.nfc.h hVar2 : arrayList) {
                    switch (com.garmin.device.nfc.b.C1030b.f50859a[com.garmin.device.nfc.h.c.a(hVar2.f50884a[0]).ordinal()]) {
                        case 1:
                            if (bVar != null) {
                                if (bVar.f50848a != null) {
                                    logger2.error("It seems the card type is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD4 = hVar2.d();
                                if (bArrD4 != null) {
                                    bVar.f50848a = Arrays.copyOf(bArrD4, bArrD4.length);
                                } else {
                                    bVar.f50848a = null;
                                }
                            } else {
                                logger2.error("No Card Id for Card type(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            break;
                        case 2:
                            if (bVar != null) {
                                if (bVar.f50849b != null) {
                                    logger2.error("It seems the issuer name is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD5 = hVar2.d();
                                if (bArrD5 != null) {
                                    bVar.f50849b = Arrays.copyOf(bArrD5, bArrD5.length);
                                } else {
                                    bVar.f50849b = null;
                                }
                            } else {
                                logger2.error("No Card Id for Issuer name(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            break;
                        case 3:
                            if (bVar != null) {
                                if (bVar.f50850c != null) {
                                    logger2.error("It seems the description is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD6 = hVar2.d();
                                if (bArrD6 != null) {
                                    bVar.f50850c = Arrays.copyOf(bArrD6, bArrD6.length);
                                } else {
                                    bVar.f50850c = null;
                                }
                            } else {
                                logger2.error("No Card Id for Description(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            if (bVar != null) {
                                if (bVar.f50851d != null) {
                                    logger2.error("It seems the Pan is already exist. However, replace the previous one.");
                                }
                                bArrD = hVar2.d();
                                if (bArrD != null) {
                                    bVar.f50851d = Arrays.copyOf(bArrD, bArrD.length);
                                } else {
                                    bVar.f50851d = null;
                                }
                            } else {
                                logger2.error("No Card Id for Pan(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            break;
                        case 4:
                            if (bVar != null) {
                                if (bVar.f50851d != null) {
                                    logger2.error("It seems the Pan is already exist. However, replace the previous one.");
                                }
                                bArrD = hVar2.d();
                                if (bArrD != null) {
                                    bVar.f50851d = Arrays.copyOf(bArrD, bArrD.length);
                                } else {
                                    bVar.f50851d = null;
                                }
                            } else {
                                logger2.error("No Card Id for Pan(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            break;
                        case 5:
                            if (bVar != null) {
                                if (bVar.f50852e != null) {
                                    logger2.error("It seems the Expiration Month is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD7 = hVar2.d();
                                if (bArrD7 != null) {
                                    bVar.f50852e = Arrays.copyOf(bArrD7, bArrD7.length);
                                } else {
                                    bVar.f50852e = null;
                                }
                            } else {
                                logger2.error("No Card Id for Expiration Month(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            if (bVar != null) {
                                if (bVar.f50853f != null) {
                                    logger2.error("It seems the Expiration Year is already exist. However, replace the previous one.");
                                }
                                bArrD2 = hVar2.d();
                                if (bArrD2 != null) {
                                    bVar.f50853f = Arrays.copyOf(bArrD2, bArrD2.length);
                                } else {
                                    bVar.f50853f = null;
                                }
                            } else {
                                logger2.error("No Card Id for Expiration Year(" + ByteBuffer.wrap(hVar2.d()).getInt() + ") of device wallet state, so drop it");
                            }
                            break;
                        case 6:
                            if (bVar != null) {
                                if (bVar.f50853f != null) {
                                    logger2.error("It seems the Expiration Year is already exist. However, replace the previous one.");
                                }
                                bArrD2 = hVar2.d();
                                if (bArrD2 != null) {
                                    bVar.f50853f = Arrays.copyOf(bArrD2, bArrD2.length);
                                } else {
                                    bVar.f50853f = null;
                                }
                            } else {
                                logger2.error("No Card Id for Expiration Year(" + ByteBuffer.wrap(hVar2.d()).getInt() + ") of device wallet state, so drop it");
                            }
                            break;
                        case 7:
                            if (bVar != null) {
                                if (bVar.f50854g != null) {
                                    logger2.error("It seems the Top Of Wallet is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD8 = hVar2.d();
                                if (bArrD8 != null) {
                                    bVar.f50854g = Arrays.copyOf(bArrD8, bArrD8.length);
                                } else {
                                    bVar.f50854g = null;
                                }
                            } else {
                                logger2.error("No Card Id for TopOfWalletAPDU of device wallet state, so drop it");
                            }
                            break;
                        case 8:
                            if (bVar != null) {
                                if (bVar.f50855h != null) {
                                    logger2.error("It seems the Card Image Hash is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD9 = hVar2.d();
                                if (bArrD9 != null) {
                                    bVar.f50855h = Arrays.copyOf(bArrD9, bArrD9.length);
                                } else {
                                    bVar.f50855h = null;
                                }
                            } else {
                                logger2.error("No Card Id for Card Image Hash(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            break;
                        case 9:
                            if (bVar != null) {
                                if (bVar.f50856i != null) {
                                    logger2.error("It seems the Card Hash is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD10 = hVar2.d();
                                if (bArrD10 != null) {
                                    bVar.f50856i = Arrays.copyOf(bArrD10, bArrD10.length);
                                } else {
                                    bVar.f50856i = null;
                                }
                            } else {
                                logger2.error("No Card Id for Card Hash(" + new String(hVar2.d(), StandardCharsets.UTF_8) + ") of device wallet state, so drop it");
                            }
                            break;
                        case 10:
                            if (bVar != null) {
                                arrayList2.add(bVar);
                            }
                            com.garmin.device.nfc.b bVar2 = new com.garmin.device.nfc.b();
                            byte[] bArrD11 = hVar2.d();
                            if (bArrD11 != null) {
                                bVar2.f50857j = Arrays.copyOf(bArrD11, bArrD11.length);
                            } else {
                                bVar2.f50857j = null;
                            }
                            bVar = bVar2;
                            break;
                        case 11:
                            if (bVar != null) {
                                if (bVar.f50858k != null) {
                                    logger2.error("It seems the Card Active is already exist. However, replace the previous one.");
                                }
                                byte[] bArrD12 = hVar2.d();
                                if (bArrD12 != null) {
                                    bVar.f50858k = Arrays.copyOf(bArrD12, bArrD12.length);
                                } else {
                                    bVar.f50858k = null;
                                }
                            } else {
                                logger2.error("No Card Id for Card Active(" + ((int) hVar2.d()[0]) + ") of device wallet state, so drop it");
                            }
                            break;
                        default:
                            logger2.error("Cannot recognize tlv tag:" + com.garmin.device.nfc.h.c.a(hVar2.f50884a[0]));
                            break;
                    }
                }
                if (bVar != null && bVar.f50857j != null) {
                    arrayList2.add(bVar);
                }
                return arrayList2;
            case 11:
                com.garmin.device.nfc.i iVar2 = (com.garmin.device.nfc.i) obj;
                Logger logger3 = NfcCommandHandler.f50799g;
                if (iVar2 == null || iVar2.d() == null || iVar2.d().length < 2) {
                    return null;
                }
                byte[] bArrD13 = iVar2.d();
                byte b14 = bArrD13[0];
                byte b15 = bArrD13[1];
                if (b14 != 1) {
                    NfcCommandHandler.f50799g.error("releaseLock: Failed to release lock. Still locked with " + ((int) b15));
                }
                return Byte.valueOf(b15);
            case 12:
                return ((bb.n) obj).e().getClass().getSimpleName();
            case 13:
                return ImmutableList.copyOf((Collection) Lists.transform(((androidx.media3.exoplayer.source.i) obj).getTrackGroups().f158154b, new p(i14)));
            case 14:
                sa.r rVar = sa.r.f158151d;
                return Integer.valueOf(((e0) obj).f8216c);
            case 15:
                Ordering<yb.c> ordering = va.c.f176554b;
                return Long.valueOf(((yb.c) obj).f195639b);
            case 16:
                Ordering<yb.c> ordering2 = va.c.f176554b;
                return Long.valueOf(((yb.c) obj).f195640c);
            case 17:
                return (vb.o) obj;
            case 18:
                vb.o oVar2 = (vb.o) obj;
                int i15 = vb.j.G;
                return oVar2;
            case 19:
                ArrayList parcelableArrayList = ((Bundle) obj).getParcelableArrayList(sa.r.f158152e);
                if (parcelableArrayList == null) {
                    return new sa.r(new e0[0]);
                }
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i16 = 0; i16 < parcelableArrayList.size(); i16++) {
                    Bundle bundle = (Bundle) parcelableArrayList.get(i16);
                    bundle.getClass();
                    builder.add(e0.a(bundle));
                }
                return new sa.r((e0[]) builder.build().toArray(new e0[0]));
            case 20:
                Bundle bundle2 = (Bundle) obj;
                String str = ea.a.f63542r;
                ea.a.b bVar3 = new ea.a.b();
                CharSequence charSequence = bundle2.getCharSequence(ea.a.f63542r);
                if (charSequence != null) {
                    bVar3.f63568a = charSequence;
                    ArrayList<Bundle> parcelableArrayList2 = bundle2.getParcelableArrayList(ea.a.f63543s);
                    if (parcelableArrayList2 != null) {
                        SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                        for (Bundle bundle3 : parcelableArrayList2) {
                            int i17 = bundle3.getInt(ea.c.f63587a);
                            int i18 = bundle3.getInt(ea.c.f63588b);
                            int i19 = bundle3.getInt(ea.c.f63589c);
                            int i24 = bundle3.getInt(ea.c.f63590d, -1);
                            Bundle bundle4 = bundle3.getBundle(ea.c.f63591e);
                            if (i24 == 1) {
                                bundle4.getClass();
                                String string = bundle4.getString(ea.f.f63592c);
                                string.getClass();
                                spannableStringValueOf.setSpan(new ea.f(string, bundle4.getInt(ea.f.f63593d)), i17, i18, i19);
                            } else if (i24 == 2) {
                                bundle4.getClass();
                                spannableStringValueOf.setSpan(new ea.h(bundle4.getInt(ea.h.f63596d), bundle4.getInt(ea.h.f63597e), bundle4.getInt(ea.h.f63598f)), i17, i18, i19);
                            } else if (i24 == 3) {
                                spannableStringValueOf.setSpan(new ea.d(), i17, i18, i19);
                            } else if (i24 == 4) {
                                bundle4.getClass();
                                String string2 = bundle4.getString(ea.i.f63602b);
                                string2.getClass();
                                spannableStringValueOf.setSpan(new ea.i(string2), i17, i18, i19);
                            }
                        }
                        bVar3.f63568a = spannableStringValueOf;
                    }
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle2.getSerializable(ea.a.f63544t);
                if (alignment != null) {
                    bVar3.f63570c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle2.getSerializable(ea.a.f63545u);
                if (alignment2 != null) {
                    bVar3.f63571d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle2.getParcelable(ea.a.f63546v);
                if (bitmap != null) {
                    bVar3.f63569b = bitmap;
                } else {
                    byte[] byteArray = bundle2.getByteArray(ea.a.f63547w);
                    if (byteArray != null) {
                        bVar3.f63569b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    }
                }
                String str2 = ea.a.f63548x;
                if (bundle2.containsKey(str2)) {
                    String str3 = ea.a.f63549y;
                    if (bundle2.containsKey(str3)) {
                        float f14 = bundle2.getFloat(str2);
                        int i25 = bundle2.getInt(str3);
                        bVar3.f63572e = f14;
                        bVar3.f63573f = i25;
                    }
                }
                String str4 = ea.a.f63550z;
                if (bundle2.containsKey(str4)) {
                    bVar3.f63574g = bundle2.getInt(str4);
                }
                String str5 = ea.a.A;
                if (bundle2.containsKey(str5)) {
                    bVar3.f63575h = bundle2.getFloat(str5);
                }
                String str6 = ea.a.B;
                if (bundle2.containsKey(str6)) {
                    bVar3.f63576i = bundle2.getInt(str6);
                }
                String str7 = ea.a.D;
                if (bundle2.containsKey(str7)) {
                    String str8 = ea.a.C;
                    if (bundle2.containsKey(str8)) {
                        float f15 = bundle2.getFloat(str7);
                        int i26 = bundle2.getInt(str8);
                        bVar3.f63578k = f15;
                        bVar3.f63577j = i26;
                    }
                }
                String str9 = ea.a.E;
                if (bundle2.containsKey(str9)) {
                    bVar3.f63579l = bundle2.getFloat(str9);
                }
                String str10 = ea.a.F;
                if (bundle2.containsKey(str10)) {
                    bVar3.f63580m = bundle2.getFloat(str10);
                }
                String str11 = ea.a.G;
                if (bundle2.containsKey(str11)) {
                    bVar3.f63582o = bundle2.getInt(str11);
                    bVar3.f63581n = true;
                }
                if (!bundle2.getBoolean(ea.a.H, false)) {
                    bVar3.f63581n = false;
                }
                String str12 = ea.a.I;
                if (bundle2.containsKey(str12)) {
                    bVar3.f63583p = bundle2.getInt(str12);
                }
                String str13 = ea.a.J;
                if (bundle2.containsKey(str13)) {
                    bVar3.f63584q = bundle2.getFloat(str13);
                }
                return bVar3.a();
            case 21:
                ea.a aVar = (ea.a) obj;
                Bitmap bitmap2 = aVar.f63554d;
                Bundle bundle5 = new Bundle();
                CharSequence charSequence2 = aVar.f63551a;
                if (charSequence2 != null) {
                    bundle5.putCharSequence(ea.a.f63542r, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str14 = ea.c.f63587a;
                        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                        for (ea.f fVar : (ea.f[]) spanned.getSpans(0, spanned.length(), ea.f.class)) {
                            fVar.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString(ea.f.f63592c, fVar.f63594a);
                            bundle6.putInt(ea.f.f63593d, fVar.f63595b);
                            arrayList3.add(ea.c.a(spanned, fVar, 1, bundle6));
                        }
                        for (ea.h hVar3 : (ea.h[]) spanned.getSpans(0, spanned.length(), ea.h.class)) {
                            hVar3.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putInt(ea.h.f63596d, hVar3.f63599a);
                            bundle7.putInt(ea.h.f63597e, hVar3.f63600b);
                            bundle7.putInt(ea.h.f63598f, hVar3.f63601c);
                            arrayList3.add(ea.c.a(spanned, hVar3, 2, bundle7));
                        }
                        for (ea.d dVar : (ea.d[]) spanned.getSpans(0, spanned.length(), ea.d.class)) {
                            arrayList3.add(ea.c.a(spanned, dVar, 3, null));
                        }
                        for (ea.i iVar3 : (ea.i[]) spanned.getSpans(0, spanned.length(), ea.i.class)) {
                            iVar3.getClass();
                            Bundle bundle8 = new Bundle();
                            bundle8.putString(ea.i.f63602b, iVar3.f63603a);
                            arrayList3.add(ea.c.a(spanned, iVar3, 4, bundle8));
                        }
                        if (!arrayList3.isEmpty()) {
                            bundle5.putParcelableArrayList(ea.a.f63543s, arrayList3);
                        }
                    }
                }
                bundle5.putSerializable(ea.a.f63544t, aVar.f63552b);
                bundle5.putSerializable(ea.a.f63545u, aVar.f63553c);
                bundle5.putFloat(ea.a.f63548x, aVar.f63555e);
                bundle5.putInt(ea.a.f63549y, aVar.f63556f);
                bundle5.putInt(ea.a.f63550z, aVar.f63557g);
                bundle5.putFloat(ea.a.A, aVar.f63558h);
                bundle5.putInt(ea.a.B, aVar.f63559i);
                bundle5.putInt(ea.a.C, aVar.f63564n);
                bundle5.putFloat(ea.a.D, aVar.f63565o);
                bundle5.putFloat(ea.a.E, aVar.f63560j);
                bundle5.putFloat(ea.a.F, aVar.f63561k);
                bundle5.putBoolean(ea.a.H, aVar.f63562l);
                bundle5.putInt(ea.a.G, aVar.f63563m);
                bundle5.putInt(ea.a.I, aVar.f63566p);
                bundle5.putFloat(ea.a.J, aVar.f63567q);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    fa.a.d(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle5.putByteArray(ea.a.f63547w, byteArrayOutputStream.toByteArray());
                }
                return bundle5;
            default:
                Ordering<yb.c> ordering3 = yb.d.f195642c;
                long j8 = ((yb.c) obj).f195639b;
                if (j8 == C.TIME_UNSET) {
                    j8 = 0;
                }
                return Long.valueOf(j8);
        }
    }

    public /* synthetic */ p(int i14) {
        this.f8350a = i14;
    }
}
