package p20;

import android.database.AbstractCursor;
import android.util.Base64;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class b extends AbstractCursor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f134984b = {"unit_id", "part_nbr", "product_nbr", "software_version", "image_url", "display_name", "product_display_name", "mac_address", "connection_type", "gble_ediv", "gble_rand", "gble_ltk", "capabilities", "application_key"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f134985a;

    public b(List<d> list) {
        this.f134985a = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final byte[] getBlob(int i14) {
        d dVar;
        int position = getPosition();
        if (position != -1 && (dVar = this.f134985a.get(position)) != null) {
            switch (i14) {
                case 9:
                    return dVar.f134997l;
                case 10:
                    return dVar.f134998m;
                case 11:
                    return dVar.f134996k;
                case 12:
                    return dVar.f134994i;
            }
        }
        return super.getBlob(i14);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        return f134984b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        return this.f134985a.size();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final double getDouble(int i14) {
        return -1.0d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final float getFloat(int i14) {
        return -1.0f;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getInt(int i14) {
        d dVar;
        int position = getPosition();
        if (position == -1 || (dVar = this.f134985a.get(position)) == null || i14 != 8) {
            return -1;
        }
        return dVar.f134995j;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final long getLong(int i14) {
        d dVar;
        int position = getPosition();
        if (position == -1 || (dVar = this.f134985a.get(position)) == null || i14 != 0) {
            return -1L;
        }
        return dVar.f134986a;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final short getShort(int i14) {
        return (short) -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String getString(int i14) {
        d dVar;
        int position = getPosition();
        if (position != -1 && (dVar = this.f134985a.get(position)) != null) {
            byte[] bArr = dVar.f134998m;
            byte[] bArr2 = dVar.f134997l;
            byte[] bArr3 = dVar.f134996k;
            switch (i14) {
                case 0:
                    return String.valueOf(dVar.f134986a);
                case 1:
                    return dVar.f134988c;
                case 2:
                    return dVar.f134989d;
                case 3:
                    return dVar.f134990e;
                case 4:
                    return dVar.f134991f;
                case 5:
                    return dVar.f134992g;
                case 6:
                    return dVar.f134993h;
                case 7:
                    return dVar.f134987b;
                case 8:
                    int i15 = dVar.f134995j;
                    if (i15 == 1) {
                        return "ble";
                    }
                    return i15 == 2 ? "btc" : PrivacyUpdateRequestError.UNKNOWN;
                case 9:
                    if (bArr3 != null && bArr2 != null && bArr != null && bArr2 != null) {
                        return Base64.encodeToString(bArr2, 0);
                    }
                    break;
                case 10:
                    if (bArr3 != null && bArr2 != null && bArr != null && bArr != null) {
                        return Base64.encodeToString(bArr, 0);
                    }
                    break;
                case 11:
                    if (bArr3 != null && bArr2 != null && bArr != null && bArr3 != null) {
                        return Base64.encodeToString(bArr3, 0);
                    }
                    break;
                case 12:
                    return Base64.encodeToString(dVar.f134994i, 0);
                case 13:
                    return dVar.f134999n;
            }
        }
        return null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean isNull(int i14) {
        return false;
    }
}
