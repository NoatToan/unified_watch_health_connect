package com.ingenic.iwds.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public class Note implements Parcelable {
    public static final Parcelable.Creator<Note> CREATOR = new a();
    public String content;
    public PendingIntent pendingIntent;
    public String title;

    public static class a implements Parcelable.Creator<Note> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Note createFromParcel(Parcel parcel) {
            Note note = new Note(null);
            note.title = parcel.readString();
            note.content = parcel.readString();
            if (parcel.readInt() != 0) {
                note.pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
            }
            return note;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Note[] newArray(int i) {
            return new Note[i];
        }
    }

    public /* synthetic */ Note(a aVar) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Note note = (Note) obj;
        String str = this.content;
        if (str == null) {
            if (note.content != null) {
                return false;
            }
        } else if (!str.equals(note.content)) {
            return false;
        }
        PendingIntent pendingIntent = this.pendingIntent;
        if (pendingIntent == null) {
            if (note.pendingIntent != null) {
                return false;
            }
        } else if (!pendingIntent.equals(note.pendingIntent)) {
            return false;
        }
        String str2 = this.title;
        if (str2 == null) {
            if (note.title != null) {
                return false;
            }
        } else if (!str2.equals(note.title)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        PendingIntent pendingIntent = this.pendingIntent;
        int iHashCode2 = (iHashCode + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Note [title=" + this.title + ", content=" + this.content + ", pendingIntent=" + this.pendingIntent + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        if (this.pendingIntent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.pendingIntent.writeToParcel(parcel, i);
        }
    }

    public Note(String str, String str2) {
        IwdsAssert.dieIf(this, str == null, "Title is null.");
        IwdsAssert.dieIf(this, str2 == null, "Content is null.");
        this.title = str;
        this.content = str2;
    }

    public Note(String str, String str2, PendingIntent pendingIntent) {
        this(str, str2);
        this.pendingIntent = pendingIntent;
    }

    private Note() {
    }
}
