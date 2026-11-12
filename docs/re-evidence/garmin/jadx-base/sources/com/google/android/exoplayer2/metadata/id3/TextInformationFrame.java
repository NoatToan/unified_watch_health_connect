package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame[] newArray(int i14) {
            return new TextInformationFrame[i14];
        }
    };
    public final String description;
    public final String value;

    public TextInformationFrame(Parcel parcel) {
        super((String) Util.castNonNull(parcel.readString()));
        this.description = parcel.readString();
        this.value = (String) Util.castNonNull(parcel.readString());
    }

    private static List<Integer> parseId3v2point4TimestampFrameForDate(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (Util.areEqual(this.f53026id, textInformationFrame.f53026id) && Util.areEqual(this.description, textInformationFrame.description) && Util.areEqual(this.value, textInformationFrame.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iJ = g.j(527, 31, this.f53026id);
        String str = this.description;
        int iHashCode = (iJ + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.f53026id;
        str.getClass();
        byte b14 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b14 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b14 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b14 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b14 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b14 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b14 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b14 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b14 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b14 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b14 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b14 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b14 = Ascii.VT;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b14 = Ascii.FF;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b14 = Ascii.CR;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b14 = Ascii.SO;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b14 = Ascii.SI;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b14 = Ascii.DLE;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b14 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b14 = Ascii.DC2;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b14 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b14 = Ascii.DC4;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b14 = Ascii.NAK;
                }
                break;
        }
        try {
            switch (b14) {
                case 0:
                case 10:
                    builder.setAlbumTitle(this.value);
                    break;
                case 1:
                case 11:
                    builder.setComposer(this.value);
                    break;
                case 2:
                case 12:
                    builder.setRecordingMonth(Integer.valueOf(Integer.parseInt(this.value.substring(2, 4)))).setRecordingDay(Integer.valueOf(Integer.parseInt(this.value.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    builder.setArtist(this.value);
                    break;
                case 4:
                case 18:
                    builder.setAlbumArtist(this.value);
                    break;
                case 5:
                case 19:
                    builder.setConductor(this.value);
                    break;
                case 6:
                case 20:
                    String[] strArrSplit = Util.split(this.value, "/");
                    builder.setTrackNumber(Integer.valueOf(Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 16:
                    builder.setTitle(this.value);
                    break;
                case 8:
                case 15:
                    builder.setWriter(this.value);
                    break;
                case 9:
                case 21:
                    builder.setRecordingYear(Integer.valueOf(Integer.parseInt(this.value)));
                    break;
                case 13:
                    List<Integer> id3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate(this.value);
                    int size = id3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.setRecordingDay(id3v2point4TimestampFrameForDate.get(2));
                            }
                        }
                        builder.setRecordingMonth(id3v2point4TimestampFrameForDate.get(1));
                    }
                    builder.setRecordingYear(id3v2point4TimestampFrameForDate.get(0));
                    break;
                case 14:
                    List<Integer> id3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate(this.value);
                    int size2 = id3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.setReleaseDay(id3v2point4TimestampFrameForDate2.get(2));
                            }
                        }
                        builder.setReleaseMonth(id3v2point4TimestampFrameForDate2.get(1));
                    }
                    builder.setReleaseYear(id3v2point4TimestampFrameForDate2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f53026id;
        String str2 = this.description;
        String str3 = this.value;
        StringBuilder sbD = v.d(v.a(v.a(v.a(22, str), str2), str3), str, ": description=", str2, ": value=");
        sbD.append(str3);
        return sbD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f53026id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }
}
