package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.format.ID3Frame;

/* JADX INFO: loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    @Nullable
    public final String description;
    public final String value;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel in) {
            return new TextInformationFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int size) {
            return new TextInformationFrame[size];
        }
    }

    public TextInformationFrame(String id, @Nullable String description, String value) {
        super(id);
        this.description = description;
        this.value = value;
    }

    private static List<Integer> a(String value) {
        ArrayList arrayList = new ArrayList();
        try {
            if (value.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(value.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(value.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(value.substring(8, 10))));
            } else if (value.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(value.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(value.substring(5, 7))));
            } else if (value.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(value.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return Util.areEqual(this.id, textInformationFrame.id) && Util.areEqual(this.description, textInformationFrame.description) && Util.areEqual(this.value, textInformationFrame.value);
    }

    public int hashCode() {
        int iHashCode = (527 + this.id.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.id;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = 15;
                }
                break;
            case 2575251:
                if (str.equals(ID3Frame.TIT2)) {
                    b = 16;
                }
                break;
            case 2581512:
                if (str.equals(ID3Frame.TPE1)) {
                    b = 17;
                }
                break;
            case 2581513:
                if (str.equals(ID3Frame.TPE2)) {
                    b = 18;
                }
                break;
            case 2581514:
                if (str.equals(ID3Frame.TPE3)) {
                    b = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 21;
                }
                break;
        }
        try {
            switch (b) {
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
                    String[] strArrSplit = Util.split(this.value, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
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
                    List<Integer> listA = a(this.value);
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.setRecordingDay(listA.get(2));
                            }
                        }
                        builder.setRecordingMonth(listA.get(1));
                    }
                    builder.setRecordingYear(listA.get(0));
                    break;
                case 14:
                    List<Integer> listA2 = a(this.value);
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.setReleaseDay(listA2.get(2));
                            }
                        }
                        builder.setReleaseMonth(listA2.get(1));
                    }
                    builder.setReleaseYear(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.id;
        String str2 = this.description;
        String str3 = this.value;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.description);
        dest.writeString(this.value);
    }

    public TextInformationFrame(Parcel in) {
        super((String) Util.castNonNull(in.readString()));
        this.description = in.readString();
        this.value = (String) Util.castNonNull(in.readString());
    }
}
