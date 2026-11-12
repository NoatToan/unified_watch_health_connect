package pb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.v;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.InlineMe;
import fa.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList<String> f136825c;

    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(String str, String str2, List<String> list) {
        super(str);
        fa.a.a(!list.isEmpty());
        this.f136824b = str2;
        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) list);
        this.f136825c = immutableListCopyOf;
        immutableListCopyOf.get(0);
    }

    public static ArrayList b(String str) {
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

    @Override // androidx.media3.common.w.b
    public final void R3(v.b bVar) {
        byte b14;
        String str = this.f136812a;
        str.getClass();
        switch (str) {
            case "TAL":
                b14 = 0;
                break;
            case "TCM":
                b14 = 1;
                break;
            case "TDA":
                b14 = 2;
                break;
            case "TP1":
                b14 = 3;
                break;
            case "TP2":
                b14 = 4;
                break;
            case "TP3":
                b14 = 5;
                break;
            case "TRK":
                b14 = 6;
                break;
            case "TT2":
                b14 = 7;
                break;
            case "TXT":
                b14 = 8;
                break;
            case "TYE":
                b14 = 9;
                break;
            case "TALB":
                b14 = 10;
                break;
            case "TCOM":
                b14 = Ascii.VT;
                break;
            case "TCON":
                b14 = Ascii.FF;
                break;
            case "TDAT":
                b14 = Ascii.CR;
                break;
            case "TDRC":
                b14 = Ascii.SO;
                break;
            case "TDRL":
                b14 = Ascii.SI;
                break;
            case "TEXT":
                b14 = Ascii.DLE;
                break;
            case "TIT2":
                b14 = 17;
                break;
            case "TPE1":
                b14 = Ascii.DC2;
                break;
            case "TPE2":
                b14 = 19;
                break;
            case "TPE3":
                b14 = Ascii.DC4;
                break;
            case "TRCK":
                b14 = Ascii.NAK;
                break;
            case "TYER":
                b14 = Ascii.SYN;
                break;
            default:
                b14 = -1;
                break;
        }
        ImmutableList<String> immutableList = this.f136825c;
        try {
            switch (b14) {
                case 0:
                case 10:
                    bVar.f8550c = immutableList.get(0);
                    break;
                case 1:
                case 11:
                    bVar.f8566s = immutableList.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = immutableList.get(0);
                    int i14 = Integer.parseInt(str2.substring(2, 4));
                    int i15 = Integer.parseInt(str2.substring(0, 2));
                    bVar.f8560m = Integer.valueOf(i14);
                    bVar.f8561n = Integer.valueOf(i15);
                    break;
                case 3:
                case 18:
                    bVar.f8549b = immutableList.get(0);
                    break;
                case 4:
                case 19:
                    bVar.f8551d = immutableList.get(0);
                    break;
                case 5:
                case 20:
                    bVar.f8567t = immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = immutableList.get(0);
                    int i16 = z.f70071a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i17 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    bVar.f8555h = Integer.valueOf(i17);
                    bVar.f8556i = numValueOf;
                    break;
                case 7:
                case 17:
                    bVar.f8548a = immutableList.get(0);
                    break;
                case 8:
                case 16:
                    bVar.f8565r = immutableList.get(0);
                    break;
                case 9:
                case 22:
                    bVar.f8559l = Integer.valueOf(Integer.parseInt(immutableList.get(0)));
                    break;
                case 12:
                    Integer numTryParse = Ints.tryParse(immutableList.get(0));
                    if (numTryParse != null) {
                        String strA = i.a(numTryParse.intValue());
                        if (strA != null) {
                            bVar.f8570w = strA;
                        }
                    } else {
                        bVar.f8570w = immutableList.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListB = b(immutableList.get(0));
                    int size = arrayListB.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.f8561n = (Integer) arrayListB.get(2);
                            }
                        }
                        bVar.f8560m = (Integer) arrayListB.get(1);
                    }
                    bVar.f8559l = (Integer) arrayListB.get(0);
                    break;
                case 15:
                    ArrayList arrayListB2 = b(immutableList.get(0));
                    int size2 = arrayListB2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.f8564q = (Integer) arrayListB2.get(2);
                            }
                        }
                        bVar.f8563p = (Integer) arrayListB2.get(1);
                    }
                    bVar.f8562o = (Integer) arrayListB2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            String str = mVar.f136812a;
            int i14 = z.f70071a;
            if (Objects.equals(this.f136812a, str) && Objects.equals(this.f136824b, mVar.f136824b) && this.f136825c.equals(mVar.f136825c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ = wr.g.j(527, 31, this.f136812a);
        String str = this.f136824b;
        return this.f136825c.hashCode() + ((iJ + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // pb.h
    public final String toString() {
        return this.f136812a + ": description=" + this.f136824b + ": values=" + this.f136825c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136812a);
        parcel.writeString(this.f136824b);
        parcel.writeStringArray((String[]) this.f136825c.toArray(new String[0]));
    }

    public /* synthetic */ m(Parcel parcel, a aVar) {
        this(parcel);
    }

    @InlineMe(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(id, description, ImmutableList.of(value))")
    @Deprecated
    public m(String str, String str2, String str3) {
        this(str, str2, ImmutableList.of(str3));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private m(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        this(string, string2, ImmutableList.copyOf(strArrCreateStringArray));
    }
}
