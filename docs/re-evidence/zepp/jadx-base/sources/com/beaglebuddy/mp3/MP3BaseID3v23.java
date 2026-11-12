package com.beaglebuddy.mp3;

import com.beaglebuddy.id3.enums.Genre;
import com.beaglebuddy.id3.enums.Language;
import com.beaglebuddy.id3.enums.PictureType;
import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.pojo.AttachedPicture;
import com.beaglebuddy.id3.pojo.SynchronizedLyric;
import com.beaglebuddy.id3.v23.ID3v23Frame;
import com.beaglebuddy.id3.v23.ID3v23Tag;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyAttachedPicture;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyComments;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyPopularimeter;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodySynchronizedLyricsText;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyTextInformation;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBodyUnsynchronizedLyrics;
import com.beaglebuddy.util.Utility;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class MP3BaseID3v23 {
    public ID3v23Tag id3v23Tag;

    public ID3v23Frame addV23Frame(FrameType frameType) {
        return this.id3v23Tag.addFrame(frameType);
    }

    public ID3v23Tag getID3v23Tag() {
        return this.id3v23Tag;
    }

    public String getV23Album() {
        return getV23Text(FrameType.ALBUM_TITLE);
    }

    public AttachedPicture getV23AttachedPicture(PictureType pictureType) {
        ID3v23Frame v23AttachedPictureFrame = getV23AttachedPictureFrame(pictureType);
        if (v23AttachedPictureFrame != null) {
            return ((ID3v23FrameBodyAttachedPicture) v23AttachedPictureFrame.getBody()).getAttachedPicture();
        }
        return null;
    }

    public ID3v23Frame getV23AttachedPictureFrame(PictureType pictureType) {
        ID3v23Frame iD3v23Frame = null;
        for (ID3v23Frame iD3v23Frame2 : getV23Frames(FrameType.ATTACHED_PICTURE)) {
            if (((ID3v23FrameBodyAttachedPicture) iD3v23Frame2.getBody()).getPictureType() == pictureType) {
                iD3v23Frame = iD3v23Frame2;
            }
        }
        return iD3v23Frame;
    }

    public List<AttachedPicture> getV23AttachedPictures() {
        List<ID3v23Frame> v23Frames = getV23Frames(FrameType.ATTACHED_PICTURE);
        Vector vector = new Vector();
        if (v23Frames.size() != 0) {
            Iterator<ID3v23Frame> it2 = v23Frames.iterator();
            while (it2.hasNext()) {
                vector.add(((ID3v23FrameBodyAttachedPicture) it2.next().getBody()).getAttachedPicture());
            }
        }
        return vector;
    }

    public int getV23AudioDuration() {
        return getV23TextAsInteger(FrameType.LENGTH) / 1000;
    }

    public int getV23AudioSize() {
        return getV23TextAsInteger(FrameType.SIZE);
    }

    public String getV23Band() {
        return getV23Text(FrameType.BAND);
    }

    public String getV23Comments(Language language) throws IllegalArgumentException {
        ID3v23Frame v23CommentsFrame = getV23CommentsFrame(language);
        if (v23CommentsFrame == null) {
            return null;
        }
        return ((ID3v23FrameBodyComments) v23CommentsFrame.getBody()).getText();
    }

    public ID3v23Frame getV23CommentsFrame(Language language) {
        ID3v23Frame iD3v23Frame = null;
        for (ID3v23Frame iD3v23Frame2 : getV23Frames(FrameType.COMMENTS)) {
            if (((ID3v23FrameBodyComments) iD3v23Frame2.getBody()).getLanguage() == language) {
                iD3v23Frame = iD3v23Frame2;
            }
        }
        return iD3v23Frame;
    }

    public int getV23Disc() {
        return getV23TextAsInteger(FrameType.PART_OF_A_SET);
    }

    public List<String> getV23Errors() {
        Vector vector = new Vector();
        Iterator<ID3v23Frame> it2 = this.id3v23Tag.getInvalidFrames().iterator();
        while (it2.hasNext()) {
            vector.add(it2.next().getInvalidMessage());
        }
        return vector;
    }

    public ID3v23Frame getV23Frame(FrameType frameType) {
        return this.id3v23Tag.getFrame(frameType);
    }

    public List<ID3v23Frame> getV23Frames(FrameType frameType) {
        return this.id3v23Tag.getFrames(frameType);
    }

    public String getV23LeadPerformer() {
        return getV23Text(FrameType.LEAD_PERFORMER);
    }

    public String getV23LyricsBy() {
        return getV23Text(FrameType.LYRICIST);
    }

    public String getV23MusicBy() {
        return getV23Text(FrameType.COMPOSER);
    }

    public String getV23MusicType() {
        return getV23Text(FrameType.CONTENT_TYPE);
    }

    public String getV23Publisher() {
        return getV23Text(FrameType.PUBLISHER);
    }

    public int getV23Rating() {
        ID3v23Frame v23Frame = getV23Frame(FrameType.POPULARIMETER);
        if (v23Frame == null) {
            return 0;
        }
        return ((ID3v23FrameBodyPopularimeter) v23Frame.getBody()).getRating();
    }

    public List<SynchronizedLyric> getV23SynchronizedLyrics(Language language) {
        ID3v23Frame v23SynchronizedLyricsFrame = getV23SynchronizedLyricsFrame(language);
        if (v23SynchronizedLyricsFrame == null) {
            return null;
        }
        return ((ID3v23FrameBodySynchronizedLyricsText) v23SynchronizedLyricsFrame.getBody()).getSynchronizedLyrics();
    }

    public ID3v23Frame getV23SynchronizedLyricsFrame(Language language) {
        ID3v23Frame iD3v23Frame = null;
        for (ID3v23Frame iD3v23Frame2 : getV23Frames(FrameType.SYNCHRONIZED_LYRIC_TEXT)) {
            if (((ID3v23FrameBodySynchronizedLyricsText) iD3v23Frame2.getBody()).getLanguage() == language) {
                iD3v23Frame = iD3v23Frame2;
            }
        }
        return iD3v23Frame;
    }

    public String getV23Text(FrameType frameType) {
        ID3v23Frame v23Frame = getV23Frame(frameType);
        if (v23Frame == null) {
            return null;
        }
        return ((ID3v23FrameBodyTextInformation) v23Frame.getBody()).getText();
    }

    public int getV23TextAsInteger(FrameType frameType) {
        String text;
        int iIndexOf;
        int i;
        ID3v23Frame v23Frame = getV23Frame(frameType);
        if (v23Frame == null) {
            return 0;
        }
        ID3v23FrameBodyTextInformation iD3v23FrameBodyTextInformation = (ID3v23FrameBodyTextInformation) v23Frame.getBody();
        try {
            i = Integer.parseInt(iD3v23FrameBodyTextInformation.getText());
            if (i < 0) {
                return 0;
            }
        } catch (NumberFormatException unused) {
            if ((frameType != FrameType.TRACK_NUMBER && frameType != FrameType.PART_OF_A_SET) || (iIndexOf = (text = iD3v23FrameBodyTextInformation.getText()).indexOf(47)) == -1) {
                return 0;
            }
            try {
                i = Integer.parseInt(text.substring(0, iIndexOf));
                if (i < 0) {
                    return 0;
                }
            } catch (NumberFormatException unused2) {
                return 0;
            }
        }
        return i;
    }

    public String getV23Title() {
        return getV23Text(FrameType.SONG_TITLE);
    }

    public int getV23Track() {
        return getV23TextAsInteger(FrameType.TRACK_NUMBER);
    }

    public String getV23UnsynchronizedLyrics(Language language) {
        ID3v23Frame v23UnsynchronizedLyricsFrame = getV23UnsynchronizedLyricsFrame(language);
        if (v23UnsynchronizedLyricsFrame == null) {
            return null;
        }
        return ((ID3v23FrameBodyUnsynchronizedLyrics) v23UnsynchronizedLyricsFrame.getBody()).getText();
    }

    public ID3v23Frame getV23UnsynchronizedLyricsFrame(Language language) {
        ID3v23Frame iD3v23Frame = null;
        for (ID3v23Frame iD3v23Frame2 : getV23Frames(FrameType.UNSYCHRONIZED_LYRICS)) {
            if (((ID3v23FrameBodyUnsynchronizedLyrics) iD3v23Frame2.getBody()).getLanguage() == language) {
                iD3v23Frame = iD3v23Frame2;
            }
        }
        return iD3v23Frame;
    }

    public int getV23Year() {
        return getV23TextAsInteger(FrameType.YEAR);
    }

    public boolean hasV23Errors() {
        return this.id3v23Tag.getInvalidFrames().size() != 0;
    }

    public ID3v23Frame removeV23Album() {
        return removeV23Frame(FrameType.ALBUM_TITLE);
    }

    public ID3v23Frame removeV23AttachedPicture(PictureType pictureType) {
        ID3v23Frame v23AttachedPictureFrame = getV23AttachedPictureFrame(pictureType);
        if (v23AttachedPictureFrame != null) {
            this.id3v23Tag.getFrames().remove(v23AttachedPictureFrame);
        }
        return v23AttachedPictureFrame;
    }

    public List<AttachedPicture> removeV23AttachedPictures() {
        List<ID3v23Frame> listRemoveV23Frames = removeV23Frames(FrameType.ATTACHED_PICTURE);
        Vector vector = new Vector();
        if (listRemoveV23Frames.size() != 0) {
            Iterator<ID3v23Frame> it2 = listRemoveV23Frames.iterator();
            while (it2.hasNext()) {
                vector.add(((ID3v23FrameBodyAttachedPicture) it2.next().getBody()).getAttachedPicture());
            }
        }
        return vector;
    }

    public ID3v23Frame removeV23AudioDuration() {
        return removeV23Frame(FrameType.LENGTH);
    }

    public ID3v23Frame removeV23AudioSize() {
        return removeV23Frame(FrameType.SIZE);
    }

    public ID3v23Frame removeV23Band() {
        return removeV23Frame(FrameType.BAND);
    }

    public ID3v23Frame removeV23Comments() throws IllegalStateException {
        return removeV23Comments(Language.ENG);
    }

    public ID3v23Frame removeV23Disc() {
        return removeV23Frame(FrameType.PART_OF_A_SET);
    }

    public ID3v23Frame removeV23Frame(FrameType frameType) {
        return this.id3v23Tag.removeFrame(frameType);
    }

    public List<ID3v23Frame> removeV23Frames(FrameType frameType) {
        return this.id3v23Tag.removeFrames(frameType);
    }

    public ID3v23Frame removeV23LeadPerformer() {
        return removeV23Frame(FrameType.LEAD_PERFORMER);
    }

    public ID3v23Frame removeV23LyricsBy() {
        return removeV23Frame(FrameType.LYRICIST);
    }

    public ID3v23Frame removeV23MusicBy() {
        return removeV23Frame(FrameType.COMPOSER);
    }

    public ID3v23Frame removeV23MusicType() {
        return removeV23Frame(FrameType.CONTENT_TYPE);
    }

    public ID3v23Frame removeV23Publisher() {
        return removeV23Frame(FrameType.PUBLISHER);
    }

    public ID3v23Frame removeV23Rating() {
        return removeV23Frame(FrameType.POPULARIMETER);
    }

    public ID3v23Frame removeV23SynchronizedLyrics(Language language) {
        ID3v23Frame v23SynchronizedLyricsFrame = getV23SynchronizedLyricsFrame(language);
        if (v23SynchronizedLyricsFrame != null) {
            this.id3v23Tag.getFrames().remove(v23SynchronizedLyricsFrame);
        }
        return v23SynchronizedLyricsFrame;
    }

    public ID3v23Frame removeV23Title() {
        return removeV23Frame(FrameType.SONG_TITLE);
    }

    public ID3v23Frame removeV23Track() {
        return removeV23Frame(FrameType.TRACK_NUMBER);
    }

    public ID3v23Frame removeV23UnsynchronizedLyrics(Language language) {
        ID3v23Frame v23UnsynchronizedLyricsFrame = getV23UnsynchronizedLyricsFrame(language);
        if (v23UnsynchronizedLyricsFrame != null) {
            this.id3v23Tag.getFrames().remove(v23UnsynchronizedLyricsFrame);
        }
        return v23UnsynchronizedLyricsFrame;
    }

    public ID3v23Frame removeV23Year() {
        return removeV23Frame(FrameType.YEAR);
    }

    public ID3v23Frame setV23Album(String str) {
        return setV23Text(str, FrameType.ALBUM_TITLE);
    }

    public ID3v23Frame setV23AttachedPicture(AttachedPicture attachedPicture) {
        ID3v23Frame v23AttachedPictureFrame = getV23AttachedPictureFrame(attachedPicture.getPictureType());
        if (v23AttachedPictureFrame == null) {
            v23AttachedPictureFrame = addV23Frame(FrameType.ATTACHED_PICTURE);
        }
        ID3v23FrameBodyAttachedPicture iD3v23FrameBodyAttachedPicture = (ID3v23FrameBodyAttachedPicture) v23AttachedPictureFrame.getBody();
        iD3v23FrameBodyAttachedPicture.setEncoding(Encoding.UTF_16);
        iD3v23FrameBodyAttachedPicture.setMimeType(attachedPicture.getMimeType());
        iD3v23FrameBodyAttachedPicture.setPictureType(attachedPicture.getPictureType());
        iD3v23FrameBodyAttachedPicture.setDescription(attachedPicture.getDescription());
        iD3v23FrameBodyAttachedPicture.setImage(attachedPicture.getImage());
        return v23AttachedPictureFrame;
    }

    public ID3v23Frame setV23AudioDuration(int i) throws IllegalArgumentException {
        if (i >= 0) {
            return setV23Text(i * 1000, FrameType.LENGTH);
        }
        throw new IllegalArgumentException("Invalid audio duration, " + i + ", specified.  It must be greater than or equal to 0.");
    }

    public ID3v23Frame setV23AudioSize(int i) throws IllegalArgumentException {
        if (i > 0) {
            return setV23Text(i, FrameType.SIZE);
        }
        throw new IllegalArgumentException("Invalid audio size specified, " + i + ".  It must be greater than or equal to 1.");
    }

    public ID3v23Frame setV23Band(String str) {
        return setV23Text(str, FrameType.BAND);
    }

    public ID3v23Frame setV23Comments(Language language, String str) throws IllegalArgumentException {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid comments.  They can not be null or empty.");
        }
        ID3v23Frame v23CommentsFrame = getV23CommentsFrame(language);
        if (v23CommentsFrame == null) {
            v23CommentsFrame = addV23Frame(FrameType.COMMENTS);
        }
        ID3v23FrameBodyComments iD3v23FrameBodyComments = (ID3v23FrameBodyComments) v23CommentsFrame.getBody();
        iD3v23FrameBodyComments.setEncoding(Encoding.UTF_16);
        iD3v23FrameBodyComments.setLanguage(language);
        iD3v23FrameBodyComments.setText(str);
        return v23CommentsFrame;
    }

    public ID3v23Frame setV23Disc(int i) throws IllegalArgumentException {
        if (i > 0) {
            return setV23Text(i, FrameType.PART_OF_A_SET);
        }
        throw new IllegalArgumentException("Invalid disc number specified, " + i + ".  It must be greater than or equal to 1.");
    }

    public ID3v23Frame setV23LeadPerformer(String str) {
        return setV23Text(str, FrameType.LEAD_PERFORMER);
    }

    public ID3v23Frame setV23LyricsBy(String str) {
        return setV23Text(str, FrameType.LYRICIST);
    }

    public ID3v23Frame setV23MusicBy(String str) {
        return setV23Text(str, FrameType.COMPOSER);
    }

    public ID3v23Frame setV23MusicType(Genre genre) {
        return setV23MusicType(genre.toString());
    }

    public ID3v23Frame setV23Publisher(String str) {
        return setV23Text(str, FrameType.PUBLISHER);
    }

    public ID3v23Frame setV23Rating(int i) {
        if (i >= 0 && i <= 255) {
            FrameType frameType = FrameType.POPULARIMETER;
            ID3v23Frame v23Frame = getV23Frame(frameType);
            if (v23Frame == null) {
                v23Frame = addV23Frame(frameType);
            }
            ((ID3v23FrameBodyPopularimeter) v23Frame.getBody()).setRating(i);
            return v23Frame;
        }
        throw new IllegalArgumentException("Invalid rating, " + i + ".  It must be between 0 and 255.");
    }

    public ID3v23Frame setV23SynchronizedLyrics(List<SynchronizedLyric> list) {
        return setV23SynchronizedLyrics(Encoding.UTF_16, Language.ENG, list);
    }

    public ID3v23Frame setV23Text(String str, FrameType frameType) {
        return setV23Text(Encoding.UTF_16, str, frameType);
    }

    public ID3v23Frame setV23Title(String str) {
        return setV23Text(str, FrameType.SONG_TITLE);
    }

    public ID3v23Frame setV23Track(int i) throws IllegalArgumentException {
        if (i > 0) {
            return setV23Text(i, FrameType.TRACK_NUMBER);
        }
        throw new IllegalArgumentException("Invalid track number specified, " + i + ".  It must be greater than or equal to 1.");
    }

    public ID3v23Frame setV23UnsynchronizedLyrics(Language language, String str) {
        ID3v23Frame v23UnsynchronizedLyricsFrame = getV23UnsynchronizedLyricsFrame(language);
        if (v23UnsynchronizedLyricsFrame == null) {
            v23UnsynchronizedLyricsFrame = addV23Frame(FrameType.UNSYCHRONIZED_LYRICS);
        }
        ID3v23FrameBodyUnsynchronizedLyrics iD3v23FrameBodyUnsynchronizedLyrics = (ID3v23FrameBodyUnsynchronizedLyrics) v23UnsynchronizedLyricsFrame.getBody();
        iD3v23FrameBodyUnsynchronizedLyrics.setEncoding(Encoding.UTF_16);
        iD3v23FrameBodyUnsynchronizedLyrics.setLanguage(language);
        iD3v23FrameBodyUnsynchronizedLyrics.setText(str);
        return v23UnsynchronizedLyricsFrame;
    }

    public ID3v23Frame setV23Year(int i) throws IllegalArgumentException {
        if (i > 0) {
            return setV23Text(i, FrameType.YEAR);
        }
        throw new IllegalArgumentException("Invalid year, " + i + ", specified.  It must be greater than or equal to 1.");
    }

    public ID3v23Frame removeV23Comments(Language language) throws IllegalArgumentException {
        ID3v23Frame v23CommentsFrame = getV23CommentsFrame(language);
        if (v23CommentsFrame != null) {
            this.id3v23Tag.getFrames().remove(v23CommentsFrame);
        }
        return v23CommentsFrame;
    }

    public ID3v23Frame setV23MusicType(String str) {
        return setV23Text(str, FrameType.CONTENT_TYPE);
    }

    public ID3v23Frame setV23SynchronizedLyrics(Language language, List<SynchronizedLyric> list) throws IllegalArgumentException {
        return setV23SynchronizedLyrics(Encoding.UTF_16, language, list);
    }

    public ID3v23Frame setV23Text(int i, FrameType frameType) throws IllegalArgumentException {
        if (i > 0) {
            return setV23Text(Encoding.ISO_8859_1, String.valueOf(i), frameType);
        }
        throw new IllegalArgumentException("Invalid number specified, " + i + ".  It must be greater than or equal to 1.");
    }

    public ID3v23Frame setV23SynchronizedLyrics(Encoding encoding, Language language, List<SynchronizedLyric> list) throws IllegalArgumentException {
        ID3v23Frame v23SynchronizedLyricsFrame = getV23SynchronizedLyricsFrame(language);
        if (v23SynchronizedLyricsFrame == null) {
            v23SynchronizedLyricsFrame = addV23Frame(FrameType.SYNCHRONIZED_LYRIC_TEXT);
        }
        ID3v23FrameBodySynchronizedLyricsText iD3v23FrameBodySynchronizedLyricsText = (ID3v23FrameBodySynchronizedLyricsText) v23SynchronizedLyricsFrame.getBody();
        iD3v23FrameBodySynchronizedLyricsText.setEncoding(encoding);
        iD3v23FrameBodySynchronizedLyricsText.setLanguage(language);
        iD3v23FrameBodySynchronizedLyricsText.setSynchronizedLyrics(list);
        return v23SynchronizedLyricsFrame;
    }

    public ID3v23Frame setV23Text(Encoding encoding, String str, FrameType frameType) {
        ID3v23Frame v23Frame = getV23Frame(frameType);
        if (v23Frame == null) {
            v23Frame = addV23Frame(frameType);
        }
        ID3v23FrameBodyTextInformation iD3v23FrameBodyTextInformation = (ID3v23FrameBodyTextInformation) v23Frame.getBody();
        iD3v23FrameBodyTextInformation.setEncoding(encoding);
        if (encoding == Encoding.UTF_16) {
            str = Utility.getUTF16String(str);
        }
        iD3v23FrameBodyTextInformation.setText(str);
        return v23Frame;
    }
}
