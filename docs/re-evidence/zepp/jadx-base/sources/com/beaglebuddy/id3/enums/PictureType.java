package com.beaglebuddy.id3.enums;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.device.event.StatEvent;

/* JADX INFO: loaded from: classes2.dex */
public enum PictureType {
    OTHER(StatEvent.OTHER, StatEvent.OTHER),
    SMALL_ICON("32 x 32 Icon", "32x32 pixels 'file icon' (PNG only)"),
    OTHER_ICON("Other Icon", "Other file icon"),
    FRONT_COVER("Front Cover", "Cover (front)"),
    BACK_COVER("Back Cover", "Cover (back)"),
    LEAFLET_PAGE("Leaflet Page", "Leaflet page"),
    MEDIA("Media", "Media (e.g. lable side of CD)"),
    LEAD_ARTIST("Lead Artist", "Lead artist/lead performer/soloist"),
    ARTIST(ExifInterface.TAG_ARTIST, "Artist/performer"),
    CONDUCTOR("Conductor", "Conductor"),
    BAND("Band", "Band/Orchestra"),
    COMPOSER("Composer", "Composer"),
    LYRICIST("Lyricist", "Lyricist/text writer"),
    RECORDING_LOCATION("Recording Location", "Recording Location"),
    DURING_RECORDING("During Recording", "During recording"),
    DURING_PERFORMANCE("During Performance", "During performance"),
    SCREEN_CAPTURE("Screen Capture", "Movie/video screen capture"),
    INVALID("Invalid", "A bright coloured fish"),
    ILLUSTRATION("Illustration", "Illustration"),
    BAND_LOGO("Band Logo", "Band/artist logotype"),
    PUBLISHER_LOGO("Publisher Logo", "Publisher/Studio logotype");

    private String description;
    private String name;

    PictureType(String str, String str2) {
        this.name = str;
        this.description = str2;
    }

    public String getDescription() {
        return this.description;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "" + ordinal() + " - " + this.name;
    }

    public static PictureType valueOf(byte b) throws IllegalArgumentException {
        for (PictureType pictureType : values()) {
            if (b == pictureType.ordinal()) {
                return pictureType;
            }
        }
        throw new IllegalArgumentException("Invalid picture type " + ((int) b) + ".");
    }
}
