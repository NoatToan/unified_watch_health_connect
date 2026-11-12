package miui.assistant.assist;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes23.dex */
public class AssistContent implements Parcelable {
    public static final Parcelable.Creator<AssistContent> CREATOR = new Parcelable.Creator<AssistContent>() { // from class: miui.assistant.assist.AssistContent.1
        @Override // android.os.Parcelable.Creator
        public AssistContent createFromParcel(Parcel parcel) {
            return new AssistContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AssistContent[] newArray(int i) {
            return new AssistContent[i];
        }
    };
    private ClipData mClipData;
    private final Bundle mExtras;
    private Intent mIntent;
    private boolean mIsAppProvidedIntent;
    private String mStructuredData;
    private Uri mUri;

    public AssistContent() {
        this.mIsAppProvidedIntent = false;
        this.mExtras = new Bundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ClipData getClipData() {
        return this.mClipData;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public String getStructuredData() {
        return this.mStructuredData;
    }

    public Uri getWebUri() {
        return this.mUri;
    }

    public boolean isAppProvidedIntent() {
        return this.mIsAppProvidedIntent;
    }

    public void setClipData(ClipData clipData) {
        this.mClipData = clipData;
    }

    public void setDefaultIntent(Intent intent) {
        Uri data;
        this.mIntent = intent;
        setWebUri(null);
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || (data = intent.getData()) == null) {
            return;
        }
        if ("http".equals(data.getScheme()) || "https".equals(data.getScheme())) {
            setWebUri(data);
        }
    }

    public void setIntent(Intent intent) {
        this.mIsAppProvidedIntent = true;
        this.mIntent = intent;
    }

    public void setStructuredData(String str) {
        this.mStructuredData = str;
    }

    public void setWebUri(Uri uri) {
        this.mUri = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcelInternal(parcel, i);
    }

    public void writeToParcelInternal(Parcel parcel, int i) {
        if (this.mIntent != null) {
            parcel.writeInt(1);
            this.mIntent.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.mClipData != null) {
            parcel.writeInt(1);
            this.mClipData.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.mUri != null) {
            parcel.writeInt(1);
            this.mUri.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.mStructuredData != null) {
            parcel.writeInt(1);
            parcel.writeString(this.mStructuredData);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.mIsAppProvidedIntent ? 1 : 0);
        parcel.writeBundle(this.mExtras);
    }

    public AssistContent(Parcel parcel) {
        this.mIsAppProvidedIntent = false;
        if (parcel.readInt() != 0) {
            this.mIntent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() != 0) {
            this.mClipData = (ClipData) ClipData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() != 0) {
            this.mUri = (Uri) Uri.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() != 0) {
            this.mStructuredData = parcel.readString();
        }
        this.mIsAppProvidedIntent = parcel.readInt() == 1;
        this.mExtras = parcel.readBundle();
    }
}
