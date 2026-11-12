package com.miui.circulate.api.protocol.audio.support;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class PlayCapacity implements Parcelable {
    public static final Parcelable.Creator<PlayCapacity> CREATOR = new a();
    public static final int FLAG_SUPPORT_AUDIO_LIST = 16;
    public static final int FLAG_SUPPORT_LAST_AUDIO = 4;
    public static final int FLAG_SUPPORT_LOOP_MODE = 32;
    public static final int FLAG_SUPPORT_NEXT_AUDIO = 8;
    public static final int FLAG_SUPPORT_PAUSE = 2;
    public static final int FLAG_SUPPORT_PLAY = 1;
    public static final int FLAG_SUPPORT_RANDOM_MODE = 64;
    public static final int FLAG_SUPPORT_SINGLE_MODE = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10297b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;

    public class a implements Parcelable.Creator<PlayCapacity> {
        @Override // android.os.Parcelable.Creator
        @RequiresApi(api = 29)
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlayCapacity createFromParcel(Parcel parcel) {
            return new PlayCapacity(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlayCapacity[] newArray(int i) {
            return new PlayCapacity[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PlayCapacity f10298a = new PlayCapacity((a) null);

        public PlayCapacity a() {
            return this.f10298a;
        }

        public b b(int i) {
            this.f10298a.f = i;
            return this;
        }

        public b c(int i) {
            this.f10298a.g = i;
            return this;
        }

        public b d(int i) {
            this.f10298a.e = i;
            return this;
        }

        public b e(boolean z) {
            if (z) {
                this.f10298a.f(16);
            }
            return this;
        }

        public b f(boolean z) {
            if (z) {
                this.f10298a.f(4);
            }
            return this;
        }

        public b g(boolean z) {
            if (z) {
                this.f10298a.f(32);
            }
            return this;
        }

        public b h(boolean z) {
            if (z) {
                this.f10298a.f(8);
            }
            return this;
        }

        public b i(boolean z) {
            if (z) {
                this.f10298a.f(2);
            }
            return this;
        }

        public b j(boolean z) {
            if (z) {
                this.f10298a.f(1);
            }
            return this;
        }

        public b k(boolean z) {
            if (z) {
                this.f10298a.f(64);
            }
            return this;
        }

        public b l(boolean z) {
            if (z) {
                this.f10298a.f(128);
            }
            return this;
        }
    }

    public /* synthetic */ PlayCapacity(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e(int i) {
        return (i & this.h) != 0;
    }

    public void f(int i) {
        this.h = i | this.h;
    }

    public String toString() {
        return "PlayCapacity{TAG='" + this.f10296a + "', canPlay=" + this.e + ", canList=" + this.f + ", canLoop=" + this.g + ", isSupportPlay=" + e(1) + ", isSupportPause=" + e(2) + ", isSupportLastAudio=" + e(4) + ", isSupportNextAudio=" + e(8) + ", isSupportAudioList=" + e(16) + ", isSupportLoopMode=" + e(32) + ", isSupportRandomMode=" + e(64) + ", isSupportSingleMode=" + e(128) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    @RequiresApi(api = 29)
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }

    public /* synthetic */ PlayCapacity(a aVar) {
        this();
    }

    public PlayCapacity() {
        this.f10296a = "PlayCapacity";
        this.f10297b = "canPlay";
        this.c = "canList";
        this.d = "canLoop";
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    @RequiresApi(api = 29)
    public PlayCapacity(Parcel parcel) {
        this.f10296a = "PlayCapacity";
        this.f10297b = "canPlay";
        this.c = "canList";
        this.d = "canLoop";
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }
}
